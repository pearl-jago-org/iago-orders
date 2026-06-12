CREATE TABLE IF NOT EXISTS orders (
    id UUID PRIMARY KEY,
    user_id UUID NOT NULL,
    product VARCHAR(100) NOT NULL,
    amount NUMERIC(10,2) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT NOW(),
    CONSTRAINT fk_user
        FOREIGN KEY (user_id)
        REFERENCES users(id)
);
