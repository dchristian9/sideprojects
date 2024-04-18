-- database m2_final_project
BEGIN TRANSACTION;

DROP TABLE IF EXISTS flash_card;


CREATE TABLE flash_card(
    card_id serial,
    question varchar(500) NOT NULL,
    answer varchar(500) NOT NULL
    );


INSERT INTO flash_card(question, answer)
VALUES
('What result does a boolean variable give as a result?', 'A true or false result'),
('Which primitive variable type is more commonly used, float or double?', 'Double is used more commonly'),
('Which primitive variable type holds larger numbers, int or long?', 'Long holds longer numbers'),
('What key word can you use to make a variable unable to be changed?', 'Key word final'),
('Can arrays have changeable lengths or are they set lengths?', 'They have set lengths set during initialization'),
('What is the name of the memory for arrays and objects?', 'The Heap'),
('How do you access the Heap to check for equality?', 'You use the dot notation, .equals()'),
('Which is easier and more commonly used, arrays or lists?', 'Lists since you are able to change lengths of the list at any time'),
('What is the difference between lists and maps?', 'Maps have key value pairs and hold 2 variables while lists can only hold one'),
('Where does a programmer define characteristics and behaviors a data type can have?', 'In the class'),
('What is the point of Encapsulation?', 'It is the concept of hiding values of data within a class to limit access points'),
('What is Inheritance?', 'The act of having one class adopt the properties and methods of another'),
('Why is Polymorphism important?', 'It allows you to write generic methods that use whatever specific version of that method is appropriate'),
('What is an Interface?', 'A declaration of one or more public methods'),
('What is an Abstract method?', 'A method with no implementation that is declared in an abstract class (BONUS: common for when you do not have all the details)');
COMMIT TRANSACTION;
