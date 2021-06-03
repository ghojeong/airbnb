package com.airbnb.repository;

import com.airbnb.domain.room.Coordinate;
import com.airbnb.domain.room.Payment;
import com.airbnb.domain.room.Room;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Repository
public class RoomRepository {
    private final JdbcTemplate jdbcTemplate;

    public RoomRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Room> getRoomList(String checkIn, String  checkOut, int priceMin, int priceMax) {

        String sql =" SELECT `pyrodb`.`room`.*  , `pyrodb`.`reservation`.id FROM `pyrodb`.`room` LEFT JOIN `pyrodb`.`reservation`  ON `pyrodb`.`room`.id = `pyrodb`.`reservation`.roomId WHERE(`reservation`.id is null or `reservation`.checkIn < ? OR `reservation`.checkOut > ?) and (`room`.price > ? and `room`.price < ?)";

        RowMapper<Room> roomRowMapper = (rs, rowNum) -> {

            Long id = rs.getLong("id");
            String thumImage = rs.getString("thumImage");
            String roomType = rs.getString("roomType");
            String roomName = rs.getString("roomName");
            String roomLabel = rs.getString("roomLabel");
            String publicAddress = rs.getString("publicAddress");
            Integer personCapacity = rs.getInt("personCapacity");
            Float starRating = rs.getFloat("starRating");
            String reviewLabel = rs.getString("reviewLabel");

            Float latitude = rs.getFloat("latitude");
            Float longitude = rs.getFloat("longitude");

            Integer price = rs.getInt("price");
            Float discount = rs.getFloat("discount");
            Integer cleaningFee = rs.getInt("cleaningFee");
            Integer serviceFee = rs.getInt("serviceFee");
            Float roomTax = rs.getFloat("roomTax");

            Coordinate coordinate = new Coordinate(latitude, longitude);

            Payment payment = new Payment(price, discount, cleaningFee, serviceFee, roomTax);

            Room room = new Room(id, thumImage, roomType, roomName, roomLabel, publicAddress,
                    personCapacity, starRating, reviewLabel, coordinate, payment);


            return room;
        };

        LocalDate parsedCheckIn = LocalDate.parse(checkIn, DateTimeFormatter.ISO_DATE);
        LocalDate parsedCheckOut = LocalDate.parse(checkOut, DateTimeFormatter.ISO_DATE);

        List<Room> rooms = jdbcTemplate.query(sql,roomRowMapper, parsedCheckIn, parsedCheckOut, priceMin, priceMax);

        return rooms;
    }

    public Payment getPaymentDetail(Long id, String checkIn, String checkOut, int Adults) {

        String sql = "SELECT price, discount, cleaningFee, serviceFee, roomTax FROM room WHERE id = ?";

        RowMapper<Payment> paymentRowMapper = (rs, rowNum) -> {
            Integer price = rs.getInt("price");
            Float discount = rs.getFloat("discount");
            Integer cleaningFee = rs.getInt("cleaningFee");
            Integer serviceFee = rs.getInt("serviceFee");
            Float roomTax = rs.getFloat("roomTax");

            Payment payment = new Payment(price, discount, cleaningFee, serviceFee, roomTax);
            return payment;
        };

        List<Payment> payments = jdbcTemplate.query(sql, paymentRowMapper, id);

        return payments.get(0);
    }
}
