--<ScriptOptions statementTerminator=";"/>

ALTER TABLE appUser DROP CONSTRAINT appUser_pkey;

DROP INDEX appUser_pkey;

DROP TABLE appUser;

CREATE TABLE appUser (
		id INT4 NOT NULL,
		firstName VARCHAR(2147483647) NOT NULL,
		lastName VARCHAR(2147483647) NOT NULL,
		password VARCHAR(2147483647) NOT NULL,
		userName VARCHAR(2147483647),
		email VARCHAR(2147483647)
	);

CREATE UNIQUE INDEX appUser_pkey ON appUser (id ASC);

ALTER TABLE appUser ADD CONSTRAINT appUser_pkey PRIMARY KEY (id);

