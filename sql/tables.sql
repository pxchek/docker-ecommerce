use ecommdb;

CREATE TABLE product
(
    pk varchar(10)  NOT NULL,
    name       varchar(255) NOT NULL,
    code       varchar(255) NOT NULL,
    qty        int,
    PRIMARY KEY (pk)
);

insert into product values ('1', 'Head phones', 'HP453', 300);
insert into product values ('2', 'Thread Mill', 'TM410', 100);
insert into product values ('3', 'Hammer', 'HQ123', 700);
insert into product values ('4', 'Iphone', 'IP5414', 100);
