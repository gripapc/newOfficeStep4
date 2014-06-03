CREATE DATABASE springapp;
GRANT ALL ON springapp.* TO springappuser@'%' IDENTIFIED BY 'pspringappuser';
GRANT ALL ON springapp.* TO springappuser@localhost IDENTIFIED BY 'pspringappuser';
USE springapp;


CREATE TABLE offices (
  id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name varchar(255),
  street varchar(255),
  zip INTEGER,
  phone INTEGER
);
