DROP TABLE IF EXISTS "entries";

CREATE TABLE "entries" (
	id				int				AUTO_INCREMENT PRIMARY KEY,
	description		VARCHAR(200)	NOT NULL,
	date_created	TIMESTAMP		NOT NULL,
	date_completed	TIMESTAMP		NULL
);

INSERT INTO "entries"
	(description, date_created, date_completed)
VALUES
	('Practice programming', '2020-01-01 10:00:00', NULL),
	('Read Java Performance by Scott Oaks', '2020-01-01 10:00:00', NULL),
	('Read Java Concurrent in Practice by Brian Goetz', '2020-02-02 08:00:00', NULL),
	('Read Java Network Programming by Elliotte Rusty Harold', '2020-03-03 11:00:00', NULL);