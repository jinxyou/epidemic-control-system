create table jkdk
(
    no   int auto_increment
        primary key,
    id   int                                 not null,
    fr   varchar(2)                          null,
    city varchar(30)                         null,
    sex  varchar(2)                          null,
    tw   float                               null,
    date timestamp default CURRENT_TIMESTAMP null,
    info varchar(1000)                       null,
    name varchar(50)                         null
);

create table noti
(
    no      int auto_increment
        primary key,
    date    timestamp default CURRENT_TIMESTAMP not null,
    title   varchar(50)                         null,
    content varchar(100)                        null
);

create table res
(
    id      int          not null
        primary key,
    name    varchar(10)  null,
    mask    int          null,
    alcohol int          null,
    meter   int          null,
    other   varchar(100) null
);

create table student
(
    id       int auto_increment
        primary key,
    name     varchar(10) null,
    password varchar(25) null,
    faculty  varchar(10) null
);


