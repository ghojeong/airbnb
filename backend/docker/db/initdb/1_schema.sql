DROP TABLE IF EXISTS `pyrodb`.`user` ;

CREATE TABLE `pyrodb`.`user` (
    `login` VARCHAR(50) NOT NULL PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS `pyrodb`.`room` ;

CREATE TABLE `pyrodb`.`room`
(
    id             INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    thumImage      VARCHAR(50),
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
