/*
    Table structure for table 'sap_confih'
 */
create table sap_config(
    id varchar(32) not null ,
    dest_name varchar(32) not null unique ,
    ashost varchar(16) default '',
    sysnr varchar(8) default '',
    client varchar(8) default '',
    username varchar(32) default '',
    paswword varchar (32) default '',
    pool_capacity varchar(8) default '',
    peak_limit varchar(8) default '',
    sap_router varchar (32) default '',
    lang char(4) default 'zh'
)

create table sap_function(
    id varchar(32) not null ,
    config_id  varchar(32) not null,
    call_name varchar(32) not null,
    function_name varchar(32) not null,
    constraint function_config_ibfk_1 foreign key (config_id) references sap_config (id)
)

