DROP DATABASE IF EXISTS observadors;
CREATE DATABASE observadors;
use observadors;

CREATE TABLE datos (
fecha VARCHAR(50),
latitud VARCHAR(50),
longitud VARCHAR(50),
especie VARCHAR(50),
profundidad VARCHAR(50),
abundancia VARCHAR(50),
size VARCHAR(50),
habitat VARCHAR(50)
) engine=innodb DEFAULT CHARSET=utf8;
