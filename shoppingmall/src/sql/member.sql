create table member
(
    member_no number primary key,
    member_id varchar2(60) unique not null,
    member_pw varchar2(30) not null,
    member_name varchar2(51) not null,
    member_nick varchar2(30) unique not null,
    member_birth char(8) not null,
    member_address varchar2(4000) not null,
    member_phone varchar2(11) unique not null,
    member_auth varchar2(9) default '회원' check(member_auth in ('회원', '판매자')) not null,
    member_point number default 0 not null,
    member_grade varchar2(9) default '씨드' check(member_grade in('씨드', '브론즈', '실버', '골드')) not null,
    member_join date default sysdate not null
);
create sequence member_seq;