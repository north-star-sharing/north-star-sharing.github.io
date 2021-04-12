---
title: DDL Code Block
description: A page holding a fenced code block version of the DDL
---

## DDL Code Block

```sqlite

create table celestial_object_image
(
    celestial_object_id CHAR(16) FOR BIT DATA not null,
    image_id            CHAR(16) FOR BIT DATA not null
)
create table celestial_object
(
    celestial_object_id CHAR(16) FOR BIT DATA not null,
    altitude            double                not null,
    azimuth             double                not null,
    cartesianx          double                not null,
    cartesiany          double                not null,
    cartesianz          double                not null,
    created             timestamp             not null,
    declination         double                not null,
    name                varchar(255)          not null,
    right_ascension     double                not null,
    updated             timestamp             not null,
    primary key (celestial_object_id)
)
create table gallery
(
    gallery_id  CHAR(16) FOR BIT DATA not null,
    created     timestamp             not null,
    description varchar(255),
    title       varchar(255)          not null,
    updated     timestamp             not null,
    user_id     CHAR(16) FOR BIT DATA not null,
    primary key (gallery_id)
)
create table image
(
    image_id     CHAR(16) FOR BIT DATA not null,
    caption      varchar(255),
    content_type varchar(255),
    created      timestamp             not null,
    image_key    varchar(255)          not null,
    name         varchar(255)          not null,
    path         varchar(255)          not null,
    title        varchar(255)          not null,
    updated      timestamp             not null,
    gallery_id   CHAR(16) FOR BIT DATA,
    user_id      CHAR(16) FOR BIT DATA not null,
    primary key (image_id)
)
create table user_profile
(
    user_id      CHAR(16) FOR BIT DATA not null,
    connected    timestamp             not null,
    created      timestamp             not null,
    display_name varchar(255)          not null,
    oauth_key    varchar(255)          not null,
    primary key (user_id)
)
create index IDXkcdnmbiao46kdmhpcy91bnqbv on celestial_object (name)
create index IDXi58ueicaylttcvuys7reb4nms on gallery (title)
create index IDXmi2mdcbc842vuy1xctaf1rg0v on image (created)
create index IDXh7fjsudcb339x2j6k298naeg on image (title)
create index IDXakmwux4w2swsj69pg3ignha1v on user_profile (created)
create index IDX7amnj5kvh6ct9ihfmqctn97s1 on user_profile (connected)
alter table user_profile
    add constraint UK_j35xlx80xoi2sb176qdrtoy69 unique (display_name)
alter table user_profile
    add constraint UK_6f815wi5o4jq8p1q1w63o4mhd unique (oauth_key)
alter table celestial_object_image
    add constraint FKnaa1fokkohmc5hqfsrt3w4yun foreign key (image_id) references image
alter table celestial_object_image
    add constraint FK5uiw10pocc41yolne7bp1381e foreign key (celestial_object_id) references celestial_object
alter table gallery
    add constraint FKdvefhhvbhoo77d367qa2pavh4 foreign key (user_id) references user_profile
alter table image
    add constraint FKgmnxnktphh1jne2xvnv5mwaom foreign key (gallery_id) references gallery
alter table image
    add constraint FKiqdab18jcjru793qdfiyvos4x foreign key (user_id) references user_profile



```

[DDL Sql code](https://github.com/north-star-sharing/north-star-sharing.github.io/blob/main/docs/work/ddl.sql)<br>