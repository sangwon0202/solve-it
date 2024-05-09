
CREATE TABLE user
(
    id VARCHAR(15) NOT NULL,
    password VARCHAR(60) NOT NULL,
    nickname VARCHAR(10) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE quiz
(
    id INT NOT NULL AUTO_INCREMENT,
    writer_id VARCHAR(15) NOT NULL,
    title VARCHAR(50) NOT NULL,
    brief VARCHAR(100) NOT NULL,
    upload_date DATE NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(writer_id) REFERENCES user(id) ON DELETE CASCADE
);

CREATE TABLE question
(
    id INT NOT NULL AUTO_INCREMENT,
    quiz_id INT NOT NULL,
    number INT NOT NULL,
    content VARCHAR(100) NOT NULL,
    type CHAR(20) NOT NULL,
    answer VARCHAR(10) NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(quiz_id) REFERENCES quiz(id) ON DELETE CASCADE
);

CREATE TABLE choice
(
    id INT NOT NULL AUTO_INCREMENT,
    question_id INT NOT NULL,
    number INT NOT NULL,
    content VARCHAR(50) NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(question_id) REFERENCES question(id) ON DELETE CASCADE
);
