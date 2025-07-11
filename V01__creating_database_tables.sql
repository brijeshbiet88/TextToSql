CREATE TABLE IF NOT EXISTS employee (
    emp_id BINARY(16) PRIMARY KEY DEFAULT (UUID_TO_BIN(UUID())),
    name VARCHAR(50) NOT NULL ,
    email VARCHAR(50) NOT NULL UNIQUE,
    gender ENUM('Male', 'Female') NOT NULL,
    phone VARCHAR(50) NOT NULL UNIQUE,
    age INT NOT NULL,
    salary INT NOT NULL
);

CREATE TABLE IF NOT EXISTS order (
    order_id BINARY(16) PRIMARY KEY DEFAULT (UUID_TO_BIN(UUID())),
    emp_id VARCHAR(50) NOT NULL,
    order_amount INT NOT NULL,
    order_date DATE NOT NULL,
    CONSTRAINT order_fkey_employee FOREIGN KEY (emp_id) REFERENCES employee (emp_id)
);