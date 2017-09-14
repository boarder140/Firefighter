DROP TABLE rank IF EXISTS;
CREATE TABLE rank (
    id int(11) NOT NULL,
    name varchar(45) NOT NULL,
    PRIMARY KEY (`id`)
);

DROP TABLE status IF EXISTS;
CREATE TABLE status (
    id int(11) NOT NULL,
    name varchar(45) NOT NULL,
    PRIMARY KEY (`id`)
);

DROP TABLE members IF EXISTS;
CREATE TABLE members (
  id int(11) NOT NULL,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) NOT NULL,
  dob datetime DEFAULT NULL,
  gender varchar(10) DEFAULT NULL,
  start_date datetime NOT NULL,
  status_id int(11) NOT NULL,
  rank_id int(11) NOT NULL,
  PRIMARY KEY (`id`)
);





