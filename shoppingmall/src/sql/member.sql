--create table member
--(
--    member_no number primary key,
--    member_id varchar2(60) unique not null,
--    member_pw varchar2(30) not null,
--    member_name varchar2(51) not null,
--    member_nick varchar2(30) unique not null,
--    member_birth char(8) not null,
--    member_address varchar2(4000) not null,
--    member_phone varchar2(11) unique not null,
--    member_auth varchar2(9) default '회원' check(member_auth in ('회원', '판매자')) not null,
--    member_point number default 0 not null,
--    member_grade varchar2(9) default '씨드' check(member_grade in('씨드', '브론즈', '실버', '골드')) not null,
--    member_join date default sysdate not null
--);
--create sequence member_seq;


CREATE TABLE MEMBER
(
    MEMBER_NO NUMBER PRIMARY KEY,
	MEMBER_ID VARCHAR2(60 BYTE),
	MEMBER_PW VARCHAR2(30 BYTE),
	MEMBER_NAME VARCHAR2(51 BYTE),
	MEMBER_NICK VARCHAR2(30 BYTE),
	MEMBER_BIRTH CHAR(8 BYTE),
	MEMBER_ADDRESS VARCHAR2(4000 BYTE),
	MEMBER_PHONE VARCHAR2(11 BYTE),
	MEMBER_AUTH VARCHAR2(9 BYTE) DEFAULT '회원',
	MEMBER_POINT NUMBER DEFAULT 0,
	MEMBER_GRADE VARCHAR2(9 BYTE) DEFAULT '씨드',
	MEMBER_JOIN DATE DEFAULT sysdate
);
CREATE SEQUENCE MEMBER_SEQ;

INSERT INTO MEMBER
    (MEMBER_NO,MEMBER_ID,MEMBER_PW,MEMBER_NAME,MEMBER_NICK,MEMBER_BIRTH,MEMBER_ADDRESS,MEMBER_PHONE,MEMBER_AUTH,MEMBER_POINT,MEMBER_GRADE,MEMBER_JOIN)
VALUES (23,'aaa@naver.com','bbb',null,'ccc',null,'ddd',null,'회원',0,'씨드','20220207');
INSERT INTO MEMBER
    (MEMBER_NO,MEMBER_ID,MEMBER_PW,MEMBER_NAME,MEMBER_NICK,MEMBER_BIRTH,MEMBER_ADDRESS,MEMBER_PHONE,MEMBER_AUTH,MEMBER_POINT,MEMBER_GRADE,MEMBER_JOIN)
VALUES (24,'aaa@naver.com','asdas',null,'ara',null,'asdasd',null,'회원',0,'씨드','20220207');
INSERT INTO MEMBER
    (MEMBER_NO,MEMBER_ID,MEMBER_PW,MEMBER_NAME,MEMBER_NICK,MEMBER_BIRTH,MEMBER_ADDRESS,MEMBER_PHONE,MEMBER_AUTH,MEMBER_POINT,MEMBER_GRADE,MEMBER_JOIN)
VALUES (25,'qqqq@naver.com','wwww',null,'하핳하',null,'ㅋㅋㅋㅋㅋ',null,'회원',0,'씨드','20220207');
