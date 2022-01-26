create table Country (
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(255)
);

create table City (
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(255),
isCapital int(1),
id_country int,
FOREIGN KEY (id_country) REFERENCES Country(id)
);