DROP TABLE IF EXISTS "entries";

CREATE TABLE "entries" (
	id				int				AUTO_INCREMENT PRIMARY KEY,
	description		VARCHAR(200)	NOT NULL,
	date_created	TIMESTAMP		NOT NULL,
	date_completed	TIMESTAMP		NULL
);