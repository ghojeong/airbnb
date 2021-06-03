DROP TABLE IF EXISTS `pyrodb`.`reservation` ;
DROP TABLE IF EXISTS `pyrodb`.`user` ;
DROP TABLE IF EXISTS `pyrodb`.`room` ;

CREATE TABLE `pyrodb`.`user` (
    `login` VARCHAR(50) NOT NULL PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL
);

CREATE TABLE `pyrodb`.`room`
(
    id             INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    thumImage      VARCHAR(1000),
    roomType       VARCHAR(50),
    roomName       VARCHAR(50),
    roomLabel      VARCHAR(50),
    publicAddress  VARCHAR(50),
    personCapacity VARCHAR(50),
    starRating     VARCHAR(50),
    reviewLabel    VARCHAR(50),

    latitude       FLOAT,
    longitude      FLOAT,

    price          INT,
    discount       FLOAT,
    cleaningFee    INT,
    serviceFee     INT,
    roomTax        FLOAT
);

create table `pyrodb`.`reservation`
(
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	checkIn date,
    checkOut date,
    roomId int,
    foreign key(roomId) references `pyrodb`.`room`(id),
    userLogin varchar(50),
    foreign key (userLogin) references `pyrodb`.`user`(logIn)
);
