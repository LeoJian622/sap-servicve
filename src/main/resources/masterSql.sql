/*
 Table structure for table `scm_person`
 user info table
 */
create table scm_person
(
    id        varchar(32) not null unique,
    name      varchar(32)  default '',
    phone     char(11)     default '',
    telephone varchar(16)  default '',
    address   varchar(64)  default '',
    enabled   tinyint      default 1,
    locked    tinyint      default 0,
    username  varchar(32)              not null unique,
    password  varchar(64)              not null,
    userface  varchar(255) default '',
    remark    varchar(255) default '',
)
/*
 Table structure for table `scm_role`
 role info table
 */
create table scm_role
(
    id      varchar(32) not null unique,
    name    varchar(32)              not null unique,
    name_zh varchar(32) default '',
)

/*
 Table structure for table 'scm_person_role'
 table of person and role relationship
 */
create table scm_person_role
(
    id        varchar(32) not null unique,
    person_id varchar(32) default not null,
    role_id   varchar(32) default not null,
    constraint person_role_ibfk_1 foreign key (person_id) references scm_person (id) on delete cascade,
    constraint preson_role_ibfk_2 foreign key (role_id) references scm_role (id) on delete cascade
)
create nonclustered index NonClu_Index_Person_Id
    on scm_person_role (person_id)
create nonclustered index NonClu_Index_Role_Id
    on scm_person_role (role_id)

/*Table structure for table `menu` */
CREATE TABLE scm_menu
(
    id          varchar(32) not null unique,
    url         varchar(64) DEFAULT '',
    path        varchar(64) DEFAULT '',
    component   varchar(64) DEFAULT '',
    name        varchar(64) DEFAULT '',
    iconCls     varchar(64) DEFAULT '',
    keepAlive   tinyint     DEFAULT 1,
    requireAuth tinyint     DEFAULT 1,
    parentId    int         DEFAULT 0,
    enabled     tinyint     DEFAULT 1,
    CONSTRAINT menu_ibfk_1 FOREIGN KEY (parentId) REFERENCES scm_menu (id)
)
create nonclustered index NonClu_Index_ParentId
    on scm_menu (parentId)
/*Table structure for table `menu_role` */

CREATE TABLE scm_menu_role
(
    id  varchar(32) not null unique,
    mid varchar(32) DEFAULT '',
    rid varchar(32) DEFAULT '',
    CONSTRAINT menu_role_ibfk_1 FOREIGN KEY (mid) REFERENCES scm_menu (id),
    CONSTRAINT menu_role_ibfk_2 FOREIGN KEY (rid) REFERENCES scm_role (id)
)
create nonclustered index NonClu_Index_Mid
    on scm_menu_role (mid)
create nonclustered index NonClu_Index_Rid
    on scm_menu_role (rid)
