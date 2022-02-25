CREATE TABLE categories(
    id VARCHAR(36) PRIMARY KEY,
    name TEXT NOT NULL,
    version INT NOT NULL,
    slug TEXT NOT NULL,
    parent_id VARCHAR(36),
    deleted BOOLEAN NOT NULL DEFAULT false
)
