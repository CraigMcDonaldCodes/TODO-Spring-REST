DROP TABLE IF EXISTS entry;

CREATE TABLE entry (
    id              int           IDENTITY PRIMARY KEY,
    description     VARCHAR(200)  NOT NULL,
    date_created    TIMESTAMP     NOT NULL,
    date_completed  TIMESTAMP     NULL
);
