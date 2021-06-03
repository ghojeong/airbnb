package com.airbnb.repository;

import com.airbnb.domain.reservation.Reservation;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Repository
public class ReservationRepository {

    private final JdbcTemplate jdbcTemplate;

    public ReservationRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void save(Reservation reservation) {
        LocalDate parsedCheckIn = LocalDate.parse(reservation.getCheckIn(), DateTimeFormatter.ISO_DATE);
        LocalDate parsedCheckOut = LocalDate.parse(reservation.getCheckOut(), DateTimeFormatter.ISO_DATE);

        String sql = "INSERT INTO `pyrodb`.`reservation`(checkIn, checkOut, roomId, userLogin) VALUES(?,?,?,?)";
        jdbcTemplate.update(sql, parsedCheckIn, parsedCheckOut, reservation.getRoomId(), reservation.getLogin());
    }

}
