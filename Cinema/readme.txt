============================================
테이블 구조
============================================
/* 멤버 테이블 */
create table tbl_member(
	mem_code int(5) auto_increment COMMENT '회원코드',
	mem_userid varchar(50) not null COMMENT '아이디',
	mem_password varchar(50) not null COMMENT '비밀번호',
	mem_username varchar(20) not null COMMENT '이름',
	mem_nickname varchar(20) not null COMMENT '닉네임',
	mem_birth DATE COMMENT '생일',
	mem_email varchar(50) COMMENT '이메일',
    mem_email_rec TINYINT(1) default 0 COMMENT '이메일 수신여부',
	mem_phone varchar(30) COMMENT '연락처',
    mem_phone_rec TINYINT(1) default 0 COMMENT '문자 수신 여부',
	mem_gender TINYINT(1) default '0' COMMENT '성별',
    mem_zipcode varchar(10) COMMENT '우편번호',
    mem_address1 varchar(200) COMMENT '주소1',
    mem_address2 varchar(200) COMMENT '상세주소',
    mem_point INT(10) default 0 COMMENT '총 포인트',
    mem_profile varchar(200) COMMENT '자기소개',
    mem_photo varchar(200) default 'none_profile.jpg' COMMENT '프로필이미지',
	mem_lev TINYINT(1) default 0 COMMENT '레벨',
	mem_reg timestamp default now() not null COMMENT '가입일자',
    constraint pk_tbl_member PRIMARY key(mem_code)
);

/* 멤버 테이블 확인 */
desc tbl_member;

/* 관리자 계정 */
insert into tbl_member(mem_userid, mem_password, mem_username, mem_nickname, mem_email, mem_phone) values 
('admin', '1234', '관리자', '관리자닉네임', 'test@gmail.com', '01012341234');

/* 테이블 모두 보기 */
select * from tbl_member;