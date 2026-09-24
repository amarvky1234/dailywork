CREATE TABLE author(
  author_id int NOT NULL AUTO_INCREMENT,
  contact_no varchar(255) DEFAULT NULL,
  dob date DEFAULT NULL,
  email_address varchar(255) DEFAULT NULL,
  full_nm varchar(255) DEFAULT NULL,
  gender varchar(255) DEFAULT NULL,
  PRIMARY KEY (`author_id`)
);