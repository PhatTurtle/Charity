create database love;

use love;

create table lover(
lover_id int auto_increment primary key,
lover_name varchar(50) not null,
lover_donate varchar(50) not null,
lover_money float not null,
lover_img varchar(50)
);



INSERT INTO lover (lover_name, lover_donate, lover_money, lover_img)
VALUES
    ('Trần Dương Gia Bảo', 'Trà sữa size L', 50000, 'bao.jpg'),
    ('Nguyễn Văn Nga', 'Trà sữa size L', 50000, 'nga.png'),
    ('Nguyễn Trần Đăng Duy', 'Trà sữa size L', 50000, 'duy.jpg'),
    ('Lương Thế Tài', 'Trà sữa size L', 50000, 'tai.jpg'),
    ('Nguyễn Tấn Phát', 'Trà sữa size L', 50000, 'phat.jpg'),
    ('Nguyễn Phúc Thuận', 'Trà sữa size L', 50000, 'thuan.jpg'),
    ('Phạm Nguyễn Như Ngọc', 'Trà sữa size L', 50000, 'ngoc.jpg');

    select * from lover;