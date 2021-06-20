
CREATE SEQUENCE  IF NOT EXISTS  payment_sequence START WITH 1   INCREMENT BY 1;
CREATE SEQUENCE  IF NOT EXISTS  payment_child_transcation_sequence START WITH 1   INCREMENT BY 1;


create table IF NOT EXISTS   payment   (

    txn_id int not null unique ,
    payment_id long not null ,
    client_id varchar(100) not null,
    client_name varchar(100) not null,
    b2b_id varchar(100) not null,
    gst_no varchar(100) not null,
    debit_account_number varchar(100) not null,
    payment_type varchar(100) not null
    );



create table IF NOT EXISTS  payment_child_transcation(
    payment_child_id int not null ,
    txn_id long  ,
    payment_status varchar(100) not null,
    beneficiary_name varchar(100) not null,
    payment_amount varchar(100) not null,
    account_number varchar(100) not null,
    account_type varchar(100) not null,
    mobile_number varchar(100) not null,
    country_code varchar(100) not null,
    bank_name varchar(100) not null,
    bank_branch varchar(100) not null,
    bank_branch_code varchar(100) not null,
    swift_code varchar(100) not null,
    foreign key (txn_id) references payment(txn_id));

