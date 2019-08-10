-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.52-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema supercity
--

CREATE DATABASE IF NOT EXISTS supercity;
USE supercity;

--
-- Definition of table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `idattendance` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `in_time` time DEFAULT NULL,
  `out_time` time DEFAULT NULL,
  `emp_emp_id` varchar(15) NOT NULL,
  PRIMARY KEY (`idattendance`),
  KEY `fk_attendance_emp1` (`emp_emp_id`),
  CONSTRAINT `fk_attendance_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` (`idattendance`,`date`,`in_time`,`out_time`,`emp_emp_id`) VALUES 
 (1,'2017-11-09','16:46:17','16:46:48','EMP001');
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;


--
-- Definition of table `badge`
--

DROP TABLE IF EXISTS `badge`;
CREATE TABLE `badge` (
  `badge_number` varchar(45) NOT NULL,
  PRIMARY KEY (`badge_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `badge`
--

/*!40000 ALTER TABLE `badge` DISABLE KEYS */;
INSERT INTO `badge` (`badge_number`) VALUES 
 ('BDG001'),
 ('BDG002'),
 ('BDG003'),
 ('BDG004'),
 ('BDG005');
/*!40000 ALTER TABLE `badge` ENABLE KEYS */;


--
-- Definition of table `bank`
--

DROP TABLE IF EXISTS `bank`;
CREATE TABLE `bank` (
  `bank_id` varchar(45) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`bank_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bank`
--

/*!40000 ALTER TABLE `bank` DISABLE KEYS */;
INSERT INTO `bank` (`bank_id`,`Name`,`status`) VALUES 
 ('BNK001','Commercial','1'),
 ('BNK002','BOC','1'),
 ('BNK003','NSB','1'),
 ('BNK004','HNB','1');
/*!40000 ALTER TABLE `bank` ENABLE KEYS */;


--
-- Definition of table `brand`
--

DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
  `brand_id` varchar(45) NOT NULL,
  `bname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`brand_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `brand`
--

/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
INSERT INTO `brand` (`brand_id`,`bname`) VALUES 
 ('BRD001','Raththi'),
 ('BRD002','Anchor'),
 ('BRD003','Atlas');
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;


--
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `cus_id` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `tp` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cus_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`cus_id`,`name`,`tp`) VALUES 
 ('CUS001','','');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Definition of table `emp`
--

DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `emp_id` varchar(15) NOT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `nic` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `bank_account` varchar(45) DEFAULT NULL,
  `post` varchar(45) DEFAULT NULL,
  `bank_bank_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `fk_emp_bank1` (`bank_bank_id`),
  CONSTRAINT `fk_emp_bank1` FOREIGN KEY (`bank_bank_id`) REFERENCES `bank` (`bank_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp`
--

/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` (`emp_id`,`fname`,`lname`,`dob`,`nic`,`gender`,`bank_account`,`post`,`bank_bank_id`) VALUES 
 ('EMP001','Prabosha','Ranasingha','2017-10-27','3573155V','female','8788758778','Manager','BNK001'),
 ('EMP002','Gayathri','Fernando','2017-11-21','456768787V','female','878687687','','BNK002'),
 ('EMP003','Thusith','Edvin','2017-11-30','8786867678V','male','878687888','null','BNK001'),
 ('EMP004','Tharuka','Sandarenu','2017-12-11','8787788V','female','787878788','null','BNK002'),
 ('EMP005','Ann','Perera','2017-11-02','78787888','female','7878778','null','BNK002');
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;


--
-- Definition of table `emp_address`
--

DROP TABLE IF EXISTS `emp_address`;
CREATE TABLE `emp_address` (
  `idemp_address` int(11) NOT NULL AUTO_INCREMENT,
  `no` varchar(45) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `emp_emp_id` varchar(15) NOT NULL,
  PRIMARY KEY (`idemp_address`),
  KEY `fk_emp_address_emp` (`emp_emp_id`),
  CONSTRAINT `fk_emp_address_emp` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp_address`
--

/*!40000 ALTER TABLE `emp_address` DISABLE KEYS */;
INSERT INTO `emp_address` (`idemp_address`,`no`,`street`,`city`,`emp_emp_id`) VALUES 
 (1,'78','Malegoda Junction','Payagala','EMP001'),
 (2,'56','malwatta road','Piliyandala','EMP002'),
 (3,'78','Temple Road','Wadduwa','EMP003'),
 (4,'56/B','Galpatha','Kalutara','EMP004'),
 (5,'40','Jaya Mawatha','Kalutara','EMP005');
/*!40000 ALTER TABLE `emp_address` ENABLE KEYS */;


--
-- Definition of table `emp_contact`
--

DROP TABLE IF EXISTS `emp_contact`;
CREATE TABLE `emp_contact` (
  `tp1` varchar(45) DEFAULT NULL,
  `tp2` varchar(45) DEFAULT NULL,
  `mail` varchar(45) DEFAULT NULL,
  `emp_emp_id` varchar(15) NOT NULL,
  KEY `fk_emp_contact_emp1` (`emp_emp_id`),
  CONSTRAINT `fk_emp_contact_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp_contact`
--

/*!40000 ALTER TABLE `emp_contact` DISABLE KEYS */;
INSERT INTO `emp_contact` (`tp1`,`tp2`,`mail`,`emp_emp_id`) VALUES 
 ('0711300864','0342228017','aaa@gmail.com','EMP001'),
 ('0713455677','0031675657','bbb@gmail.com','EMP002'),
 ('088787878','878787443','nnn@gmail.com','EMP003'),
 ('0788787676','0786766667','sss@gmail.com','EMP004'),
 ('07878788','08878784','mmm@gmail.com','EMP005');
/*!40000 ALTER TABLE `emp_contact` ENABLE KEYS */;


--
-- Definition of table `emp_has_forget_password`
--

DROP TABLE IF EXISTS `emp_has_forget_password`;
CREATE TABLE `emp_has_forget_password` (
  `emp_emp_id` varchar(15) NOT NULL,
  `forget_password_question_id` int(11) NOT NULL,
  `answer` text,
  PRIMARY KEY (`emp_emp_id`,`forget_password_question_id`),
  KEY `fk_emp_has_forget_password_forget_password1` (`forget_password_question_id`),
  KEY `fk_emp_has_forget_password_emp1` (`emp_emp_id`),
  CONSTRAINT `fk_emp_has_forget_password_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_emp_has_forget_password_forget_password1` FOREIGN KEY (`forget_password_question_id`) REFERENCES `forget_password` (`question_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp_has_forget_password`
--

/*!40000 ALTER TABLE `emp_has_forget_password` DISABLE KEYS */;
INSERT INTO `emp_has_forget_password` (`emp_emp_id`,`forget_password_question_id`,`answer`) VALUES 
 ('EMP001',1,'Kaluthara'),
 ('EMP001',2,'Pink'),
 ('EMP001',3,'Prabo');
/*!40000 ALTER TABLE `emp_has_forget_password` ENABLE KEYS */;


--
-- Definition of table `forget_password`
--

DROP TABLE IF EXISTS `forget_password`;
CREATE TABLE `forget_password` (
  `question_id` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`question_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `forget_password`
--

/*!40000 ALTER TABLE `forget_password` DISABLE KEYS */;
INSERT INTO `forget_password` (`question_id`,`question`) VALUES 
 (1,'What is your home town?'),
 (2,'What is your favourit colour?'),
 (3,'What is your first teacher?'),
 (4,'What is your mother name?');
/*!40000 ALTER TABLE `forget_password` ENABLE KEYS */;


--
-- Definition of table `grn`
--

DROP TABLE IF EXISTS `grn`;
CREATE TABLE `grn` (
  `grn_id` varchar(45) NOT NULL,
  `date` varchar(45) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `dis_value` double DEFAULT NULL,
  `net_tot` double DEFAULT NULL,
  `supplier_sup_id` varchar(45) NOT NULL,
  `emp_emp_id` varchar(15) NOT NULL,
  `purchase_order_po_id` varchar(45) NOT NULL,
  PRIMARY KEY (`grn_id`),
  KEY `fk_grn_supplier1` (`supplier_sup_id`),
  KEY `fk_grn_emp1` (`emp_emp_id`),
  KEY `fk_grn_purchase_order1` (`purchase_order_po_id`),
  CONSTRAINT `fk_grn_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_grn_purchase_order1` FOREIGN KEY (`purchase_order_po_id`) REFERENCES `purchase_order` (`po_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_grn_supplier1` FOREIGN KEY (`supplier_sup_id`) REFERENCES `supplier` (`sup_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `grn`
--

/*!40000 ALTER TABLE `grn` DISABLE KEYS */;
INSERT INTO `grn` (`grn_id`,`date`,`total`,`discount`,`dis_value`,`net_tot`,`supplier_sup_id`,`emp_emp_id`,`purchase_order_po_id`) VALUES 
 ('GRN01','2017-11-09',164400,0,0,164400,'SUP002','EMP001','PO002');
/*!40000 ALTER TABLE `grn` ENABLE KEYS */;


--
-- Definition of table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
CREATE TABLE `invoice` (
  `inv_id` varchar(45) NOT NULL,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  `subtot` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `dis_value` double DEFAULT NULL,
  `nettot` double DEFAULT NULL,
  `emp_emp_id` varchar(15) NOT NULL,
  `customer_cus_id` varchar(45) NOT NULL,
  PRIMARY KEY (`inv_id`),
  KEY `fk_invoice_emp1` (`emp_emp_id`),
  KEY `fk_invoice_customer1` (`customer_cus_id`),
  CONSTRAINT `fk_invoice_customer1` FOREIGN KEY (`customer_cus_id`) REFERENCES `customer` (`cus_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_invoice_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `invoice`
--

/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` (`inv_id`,`date`,`time`,`subtot`,`discount`,`dis_value`,`nettot`,`emp_emp_id`,`customer_cus_id`) VALUES 
 ('INV001','2017-11-09','16:56:02',14300,0,0,14300,'EMP001','CUS001');
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;


--
-- Definition of table `invoice_has_item`
--

DROP TABLE IF EXISTS `invoice_has_item`;
CREATE TABLE `invoice_has_item` (
  `invoice_inv_id` varchar(45) NOT NULL,
  `item_item_id` varchar(45) NOT NULL,
  `qty` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `disc` double DEFAULT NULL,
  `disc_value` double DEFAULT NULL,
  `sub_tot` double DEFAULT NULL,
  PRIMARY KEY (`invoice_inv_id`,`item_item_id`),
  KEY `fk_invoice_has_item_item1` (`item_item_id`),
  KEY `fk_invoice_has_item_invoice1` (`invoice_inv_id`),
  CONSTRAINT `fk_invoice_has_item_invoice1` FOREIGN KEY (`invoice_inv_id`) REFERENCES `invoice` (`inv_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_invoice_has_item_item1` FOREIGN KEY (`item_item_id`) REFERENCES `item` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `invoice_has_item`
--

/*!40000 ALTER TABLE `invoice_has_item` DISABLE KEYS */;
INSERT INTO `invoice_has_item` (`invoice_inv_id`,`item_item_id`,`qty`,`total`,`disc`,`disc_value`,`sub_tot`) VALUES 
 ('INV001','ITM002',300,15000,10,1500,13500),
 ('INV001','ITM005',10,800,0,0,800);
/*!40000 ALTER TABLE `invoice_has_item` ENABLE KEYS */;


--
-- Definition of table `item`
--

DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `item_id` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `add_date` date DEFAULT NULL,
  `unit_price` double DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `sale_price` double DEFAULT NULL,
  `brand_brand_id` varchar(45) NOT NULL,
  `badge_badge_number` varchar(45) NOT NULL,
  `type_idtype` int(11) NOT NULL,
  PRIMARY KEY (`item_id`),
  KEY `fk_item_brand1` (`brand_brand_id`),
  KEY `fk_item_badge1` (`badge_badge_number`),
  KEY `fk_item_type1` (`type_idtype`),
  CONSTRAINT `fk_item_badge1` FOREIGN KEY (`badge_badge_number`) REFERENCES `badge` (`badge_number`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_brand1` FOREIGN KEY (`brand_brand_id`) REFERENCES `brand` (`brand_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_type1` FOREIGN KEY (`type_idtype`) REFERENCES `type` (`idtype`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` (`item_id`,`name`,`add_date`,`unit_price`,`status`,`sale_price`,`brand_brand_id`,`badge_badge_number`,`type_idtype`) VALUES 
 ('ITM001','Suger','2017-11-09',100,'1',150,'BRD001','BDG001',1),
 ('ITM002','Soap','2017-11-09',40,'1',50,'BRD001','BDG002',3),
 ('ITM003','Milk','2017-11-09',300,'1',350,'BRD002','BDG003',1),
 ('ITM004','Milk','2017-11-09',300,'1',350,'BRD001','BDG004',1),
 ('ITM005','Book','2017-11-09',100,'1',80,'BRD001','BDG005',4);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;


--
-- Definition of table `item_has_grn`
--

DROP TABLE IF EXISTS `item_has_grn`;
CREATE TABLE `item_has_grn` (
  `item_item_id` varchar(45) NOT NULL,
  `grn_grn_id` varchar(45) NOT NULL,
  `qty` double DEFAULT NULL,
  `tot` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `subtot` double DEFAULT NULL,
  `made_date` date DEFAULT NULL,
  `exp_date` date DEFAULT NULL,
  PRIMARY KEY (`item_item_id`,`grn_grn_id`),
  KEY `fk_item_has_grn_grn1` (`grn_grn_id`),
  KEY `fk_item_has_grn_item1` (`item_item_id`),
  CONSTRAINT `fk_item_has_grn_grn1` FOREIGN KEY (`grn_grn_id`) REFERENCES `grn` (`grn_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_has_grn_item1` FOREIGN KEY (`item_item_id`) REFERENCES `item` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item_has_grn`
--

/*!40000 ALTER TABLE `item_has_grn` DISABLE KEYS */;
INSERT INTO `item_has_grn` (`item_item_id`,`grn_grn_id`,`qty`,`tot`,`discount`,`subtot`,`made_date`,`exp_date`) VALUES 
 ('ITM002','GRN01',400,16000,10,14400,'2017-11-05','2017-11-30'),
 ('ITM005','GRN01',1500,150000,0,150000,'2017-11-17','2017-11-18');
/*!40000 ALTER TABLE `item_has_grn` ENABLE KEYS */;


--
-- Definition of table `item_has_supplier`
--

DROP TABLE IF EXISTS `item_has_supplier`;
CREATE TABLE `item_has_supplier` (
  `item_item_id` varchar(45) NOT NULL,
  `supplier_sup_id` varchar(45) NOT NULL,
  KEY `fk_item_has_supplier_supplier1` (`supplier_sup_id`),
  KEY `fk_item_has_supplier_item1` (`item_item_id`),
  CONSTRAINT `fk_item_has_supplier_item1` FOREIGN KEY (`item_item_id`) REFERENCES `item` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_has_supplier_supplier1` FOREIGN KEY (`supplier_sup_id`) REFERENCES `supplier` (`sup_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item_has_supplier`
--

/*!40000 ALTER TABLE `item_has_supplier` DISABLE KEYS */;
INSERT INTO `item_has_supplier` (`item_item_id`,`supplier_sup_id`) VALUES 
 ('ITM002','SUP001'),
 ('ITM005','SUP002'),
 ('ITM002','SUP002'),
 ('ITM002','SUP003');
/*!40000 ALTER TABLE `item_has_supplier` ENABLE KEYS */;


--
-- Definition of table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `user_name` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `emp_emp_id` varchar(15) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`emp_emp_id`),
  KEY `fk_login_emp1` (`emp_emp_id`),
  CONSTRAINT `fk_login_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`user_name`,`password`,`emp_emp_id`,`status`,`type`) VALUES 
 ('Pro','12345','EMP001','1','M'),
 ('Gai','12345','EMP002','1','A'),
 ('Ted','12345','EMP003','1','A'),
 ('Tharu','12345','EMP004','1','S'),
 ('Ann','12345','EMP005','0','S');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;


--
-- Definition of table `maintains`
--

DROP TABLE IF EXISTS `maintains`;
CREATE TABLE `maintains` (
  `maintains_id` varchar(45) NOT NULL,
  `date` date DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `emp_emp_id` varchar(15) NOT NULL,
  `amount` double DEFAULT NULL,
  PRIMARY KEY (`maintains_id`),
  KEY `fk_maintains_emp1` (`emp_emp_id`),
  CONSTRAINT `fk_maintains_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `maintains`
--

/*!40000 ALTER TABLE `maintains` DISABLE KEYS */;
INSERT INTO `maintains` (`maintains_id`,`date`,`description`,`emp_emp_id`,`amount`) VALUES 
 ('M001','2017-11-09','lkjlfdsg','EMP001',10000),
 ('M002','2017-11-09','bvjhnvh','EMP001',102);
/*!40000 ALTER TABLE `maintains` ENABLE KEYS */;


--
-- Definition of table `money_account`
--

DROP TABLE IF EXISTS `money_account`;
CREATE TABLE `money_account` (
  `idmoney_account` int(11) NOT NULL,
  `amount` double DEFAULT NULL,
  PRIMARY KEY (`idmoney_account`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `money_account`
--

/*!40000 ALTER TABLE `money_account` DISABLE KEYS */;
INSERT INTO `money_account` (`idmoney_account`,`amount`) VALUES 
 (1,963344.666666667);
/*!40000 ALTER TABLE `money_account` ENABLE KEYS */;


--
-- Definition of table `payment_type`
--

DROP TABLE IF EXISTS `payment_type`;
CREATE TABLE `payment_type` (
  `pay_type` varchar(45) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `invoice_inv_id` varchar(45) NOT NULL,
  PRIMARY KEY (`pay_type`),
  KEY `fk_payment_type_invoice1` (`invoice_inv_id`),
  CONSTRAINT `fk_payment_type_invoice1` FOREIGN KEY (`invoice_inv_id`) REFERENCES `invoice` (`inv_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment_type`
--

/*!40000 ALTER TABLE `payment_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment_type` ENABLE KEYS */;


--
-- Definition of table `petty_cash`
--

DROP TABLE IF EXISTS `petty_cash`;
CREATE TABLE `petty_cash` (
  `petti_id` varchar(45) NOT NULL,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  `discription` text,
  `emp_emp_id` varchar(15) NOT NULL,
  `amount` double DEFAULT NULL,
  PRIMARY KEY (`petti_id`),
  KEY `fk_petty_cash_emp1` (`emp_emp_id`),
  CONSTRAINT `fk_petty_cash_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petty_cash`
--

/*!40000 ALTER TABLE `petty_cash` DISABLE KEYS */;
INSERT INTO `petty_cash` (`petti_id`,`date`,`time`,`discription`,`emp_emp_id`,`amount`) VALUES 
 ('PETTY001','2017-11-09','17:10:11','fgcghdhg','EMP001',10000);
/*!40000 ALTER TABLE `petty_cash` ENABLE KEYS */;


--
-- Definition of table `petty_cash_account`
--

DROP TABLE IF EXISTS `petty_cash_account`;
CREATE TABLE `petty_cash_account` (
  `date` date NOT NULL,
  `amount` double DEFAULT NULL,
  `emp_emp_id` varchar(15) NOT NULL,
  PRIMARY KEY (`date`),
  KEY `fk_petty_cash_account_emp1` (`emp_emp_id`),
  CONSTRAINT `fk_petty_cash_account_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petty_cash_account`
--

/*!40000 ALTER TABLE `petty_cash_account` DISABLE KEYS */;
INSERT INTO `petty_cash_account` (`date`,`amount`,`emp_emp_id`) VALUES 
 ('2017-11-09',40000,'EMP001');
/*!40000 ALTER TABLE `petty_cash_account` ENABLE KEYS */;


--
-- Definition of table `po_pay`
--

DROP TABLE IF EXISTS `po_pay`;
CREATE TABLE `po_pay` (
  `date` date DEFAULT NULL,
  `cheque` varchar(45) DEFAULT NULL,
  `outdate` date DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `emp_emp_id` varchar(15) DEFAULT NULL,
  `purchase_order_po_id` varchar(45) NOT NULL,
  `amount` double DEFAULT NULL,
  PRIMARY KEY (`purchase_order_po_id`),
  KEY `fk_po_pay_emp1` (`emp_emp_id`),
  KEY `fk_po_pay_purchase_order1` (`purchase_order_po_id`),
  CONSTRAINT `fk_po_pay_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_po_pay_purchase_order1` FOREIGN KEY (`purchase_order_po_id`) REFERENCES `purchase_order` (`po_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `po_pay`
--

/*!40000 ALTER TABLE `po_pay` DISABLE KEYS */;
INSERT INTO `po_pay` (`date`,`cheque`,`outdate`,`status`,`emp_emp_id`,`purchase_order_po_id`,`amount`) VALUES 
 ('2017-11-09','123456','2017-11-22','1','EMP001','PO001',1000),
 ('2017-11-09','123456','2017-11-15','1','EMP001','PO004',1200),
 ('2017-11-09','456789','2017-11-16','1','EMP001','PO005',4000),
 ('2017-11-09','123456','2017-11-30','1','EMP001','PO006',200080);
/*!40000 ALTER TABLE `po_pay` ENABLE KEYS */;


--
-- Definition of table `purchase_order`
--

DROP TABLE IF EXISTS `purchase_order`;
CREATE TABLE `purchase_order` (
  `po_id` varchar(45) NOT NULL,
  `date` date DEFAULT NULL,
  `need_date` date DEFAULT NULL,
  `emp_emp_id` varchar(15) NOT NULL,
  `total` double DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `supplier_sup_id` varchar(45) NOT NULL,
  PRIMARY KEY (`po_id`),
  KEY `fk_purchase_order_emp1` (`emp_emp_id`),
  KEY `fk_purchase_order_supplier1` (`supplier_sup_id`),
  CONSTRAINT `fk_purchase_order_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_purchase_order_supplier1` FOREIGN KEY (`supplier_sup_id`) REFERENCES `supplier` (`sup_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchase_order`
--

/*!40000 ALTER TABLE `purchase_order` DISABLE KEYS */;
INSERT INTO `purchase_order` (`po_id`,`date`,`need_date`,`emp_emp_id`,`total`,`status`,`supplier_sup_id`) VALUES 
 ('PO001','2017-11-09','2017-11-23','EMP001',4000,'1','SUP001'),
 ('PO002','2017-11-09','2017-11-17','EMP001',16000,'0','SUP002'),
 ('PO003','2017-11-09','2017-11-17','EMP001',20000,'1','SUP002'),
 ('PO004','2017-11-09','2017-11-17','EMP001',10000,'1','SUP002'),
 ('PO005','2017-11-09','2017-11-24','EMP001',4000,'1','SUP003'),
 ('PO006','2017-11-09','2017-11-18','EMP001',200080,'1','SUP001');
/*!40000 ALTER TABLE `purchase_order` ENABLE KEYS */;


--
-- Definition of table `purchase_order_has_item`
--

DROP TABLE IF EXISTS `purchase_order_has_item`;
CREATE TABLE `purchase_order_has_item` (
  `purchase_order_po_id` varchar(45) NOT NULL,
  `item_item_id` varchar(45) NOT NULL,
  `qty` double DEFAULT NULL,
  `tot` double DEFAULT NULL,
  PRIMARY KEY (`purchase_order_po_id`,`item_item_id`),
  KEY `fk_purchase_order_has_item_item1` (`item_item_id`),
  KEY `fk_purchase_order_has_item_purchase_order1` (`purchase_order_po_id`),
  CONSTRAINT `fk_purchase_order_has_item_item1` FOREIGN KEY (`item_item_id`) REFERENCES `item` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_purchase_order_has_item_purchase_order1` FOREIGN KEY (`purchase_order_po_id`) REFERENCES `purchase_order` (`po_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchase_order_has_item`
--

/*!40000 ALTER TABLE `purchase_order_has_item` DISABLE KEYS */;
INSERT INTO `purchase_order_has_item` (`purchase_order_po_id`,`item_item_id`,`qty`,`tot`) VALUES 
 ('PO001','ITM002',100,4000),
 ('PO002','ITM002',400,16000),
 ('PO002','ITM005',1600,160000),
 ('PO003','ITM002',500,20000),
 ('PO003','ITM005',1600,160000),
 ('PO004','ITM005',100,10000),
 ('PO005','ITM002',100,4000),
 ('PO006','ITM002',5002,200080);
/*!40000 ALTER TABLE `purchase_order_has_item` ENABLE KEYS */;


--
-- Definition of table `salary`
--

DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
  `date` date DEFAULT NULL,
  `epf` double DEFAULT NULL,
  `etf` double DEFAULT NULL,
  `nope` double DEFAULT NULL,
  `nettot` double DEFAULT NULL,
  `emp_emp_id` varchar(15) NOT NULL,
  `login_emp_emp_id` varchar(15) NOT NULL,
  `advance` double DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `ym` varchar(45) DEFAULT NULL,
  KEY `fk_salary_emp1` (`emp_emp_id`),
  KEY `fk_salary_login1` (`login_emp_emp_id`),
  CONSTRAINT `fk_salary_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_salary_login1` FOREIGN KEY (`login_emp_emp_id`) REFERENCES `login` (`emp_emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salary`
--

/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` (`date`,`epf`,`etf`,`nope`,`nettot`,`emp_emp_id`,`login_emp_emp_id`,`advance`,`status`,`ym`) VALUES 
 ('2017-11-09',13.3333333333333,20,0,153.333333333333,'emp001','EMP001',NULL,'1','2017-11');
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;


--
-- Definition of table `stock`
--

DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `qty` double DEFAULT NULL,
  `item_item_id` varchar(45) NOT NULL,
  KEY `fk_stock_item1` (`item_item_id`),
  CONSTRAINT `fk_stock_item1` FOREIGN KEY (`item_item_id`) REFERENCES `item` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock`
--

/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` (`qty`,`item_item_id`) VALUES 
 (0,'ITM001'),
 (100,'ITM002'),
 (0,'ITM003'),
 (0,'ITM004'),
 (1490,'ITM005');
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;


--
-- Definition of table `sup_address`
--

DROP TABLE IF EXISTS `sup_address`;
CREATE TABLE `sup_address` (
  `idemp_address` int(11) NOT NULL AUTO_INCREMENT,
  `no` varchar(45) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `supplier_sup_id` varchar(45) NOT NULL,
  PRIMARY KEY (`idemp_address`),
  KEY `fk_sup_address_supplier1` (`supplier_sup_id`),
  CONSTRAINT `fk_sup_address_supplier1` FOREIGN KEY (`supplier_sup_id`) REFERENCES `supplier` (`sup_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sup_address`
--

/*!40000 ALTER TABLE `sup_address` DISABLE KEYS */;
INSERT INTO `sup_address` (`idemp_address`,`no`,`street`,`city`,`supplier_sup_id`) VALUES 
 (1,'79','Temple Road','Kalutara','SUP001'),
 (2,'75','aaa','aaa','SUP002'),
 (3,'67','sss','sss','SUP003');
/*!40000 ALTER TABLE `sup_address` ENABLE KEYS */;


--
-- Definition of table `sup_contact`
--

DROP TABLE IF EXISTS `sup_contact`;
CREATE TABLE `sup_contact` (
  `tp1` varchar(45) NOT NULL,
  `tp2` varchar(45) DEFAULT NULL,
  `mail` varchar(45) DEFAULT NULL,
  `supplier_sup_id` varchar(45) NOT NULL,
  KEY `fk_emp_contact_copy1_supplier1` (`supplier_sup_id`),
  CONSTRAINT `fk_emp_contact_copy1_supplier1` FOREIGN KEY (`supplier_sup_id`) REFERENCES `supplier` (`sup_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sup_contact`
--

/*!40000 ALTER TABLE `sup_contact` DISABLE KEYS */;
INSERT INTO `sup_contact` (`tp1`,`tp2`,`mail`,`supplier_sup_id`) VALUES 
 ('0714444555','0787776667','hhh@gmail.com','SUP001'),
 ('787878','67878','ggg@gmail.com','SUP002'),
 ('8787833','6677878','qqq@gmail.com','SUP003');
/*!40000 ALTER TABLE `sup_contact` ENABLE KEYS */;


--
-- Definition of table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `sup_id` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `joined_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`sup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` (`sup_id`,`name`,`status`,`joined_date`) VALUES 
 ('SUP001','Ginesha','1','2017-11-14'),
 ('SUP002','Dizny','1','2017-11-01'),
 ('SUP003','Nishadi','1','2017-11-12');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;


--
-- Definition of table `type`
--

DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `idtype` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtype`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `type`
--

/*!40000 ALTER TABLE `type` DISABLE KEYS */;
INSERT INTO `type` (`idtype`,`tname`) VALUES 
 (1,'Food'),
 (2,'Fruits'),
 (3,'Soap'),
 (4,'Book');
/*!40000 ALTER TABLE `type` ENABLE KEYS */;


--
-- Definition of table `waste`
--

DROP TABLE IF EXISTS `waste`;
CREATE TABLE `waste` (
  `waste_id` varchar(45) NOT NULL,
  `date` date DEFAULT NULL,
  `discription` varchar(250) DEFAULT NULL,
  `emp_emp_id` varchar(15) NOT NULL,
  PRIMARY KEY (`waste_id`),
  KEY `fk_waste_emp1` (`emp_emp_id`),
  CONSTRAINT `fk_waste_emp1` FOREIGN KEY (`emp_emp_id`) REFERENCES `emp` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `waste`
--

/*!40000 ALTER TABLE `waste` DISABLE KEYS */;
/*!40000 ALTER TABLE `waste` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
