CREATE TABLE tb_food (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    quantidade INT,
    categoria VARCHAR(100),
    validade TIMESTAMP
);