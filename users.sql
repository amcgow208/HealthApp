SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

DROP DATABASE IF EXISTS userInfo;
CREATE DATABASE IF NOT EXISTS userInfo DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE userInfo;

DROP TABLE IF EXISTS USERINFO;
CREATE TABLE IF NOT EXISTS USERINFO (
  USERID int(11) NOT NULL AUTO_INCREMENT,
  USERNAME varchar(30) NOT NULL,
  PASSWORD varchar(30) NOT NULL,
  PRIMARY KEY (USERID)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO USERINFO (USERID, USERNAME, PASSWORD) VALUES
(1, 'Test', '1234')

DROP TABLE IF EXISTS HEALTHINFO;
CREATE TABLE IF NOT EXISTS HEALTHINFO (
  HEALTHID int(11) NOT NULL AUTO_INCREMENT,
  HEIGHT varchar(7) NOT NULL,
  WEIGHT varchar(30) NOT NULL,
  USERID int(11) NOT NULL,
  PRIMARY KEY (HEALTHID)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

INSERT INTO HEALTHINFO (HEALTHID, HEIGHT, WEIGHT, USERID) VALUES
(1, '75', '85', 1)


ALTER TABLE HEALTHINFO
  ADD CONSTRAINT HEALTHINFO_ibfk_1 FOREIGN KEY (USERID) REFERENCES USERINFO (USERID);
  
DELIMITER $$
--
-- Procedures

DROP PROCEDURE IF EXISTS `GetHealthinfo`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `GetHealthinfo` (IN `inUserId` INT)  BEGIN
 SELECT *
 FROM     HEALTHINFO
 WHERE  USERID = inUserId ;
END$$


DELIMITER ;  

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
