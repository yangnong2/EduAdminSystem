/*
MySQL - 5.7.24-log : Database - edu-admin
*********************************************************************
*/

CREATE DATABASE `edu-admin`;

USE `edu-admin`;

/*Table structure for table `roles` */
DROP TABLE IF EXISTS `roles`;
create table roles
(
	id int auto_increment,
	rname varchar(7) null comment '角色名',
	constraint roles_pk
		primary key (id)
);
INSERT INTO `edu-admin`.roles (rname) VALUES ('管理员');
INSERT INTO `edu-admin`.roles (rname) VALUES ('教师');
INSERT INTO `edu-admin`.roles (rname) VALUES ('本科学生');
INSERT INTO `edu-admin`.roles (rname) VALUES ('硕士研究生');
INSERT INTO `edu-admin`.roles (rname) VALUES ('博士研究生');


/*Table structure for table `institutes` */
DROP TABLE IF EXISTS `institutes`;
create table institutes
(
	id int auto_increment,
	iname varchar(20) null comment '院系名称',
	constraint institutes_pk
		primary key (id)
);


/*Table structure for table `users` */
DROP TABLE IF EXISTS `users`;
create table users
(
	id int auto_increment,
	uname varchar(15) null comment '人员名',
	unique_unumber varchar(20) null comment '唯一人员标识号',
	iid int null comment '所在院系',
	password varchar(32) null comment '密码',
	phone varchar(15) null comment '手机号',
	identity_card varchar(19) null comment '身份证号',
	email varchar(50) null comment '邮箱',
	regtime Date null comment '注册时间',
	admission_time Date null comment '入学时间',
	graduate_time Date null comment '毕业时间',
	repeat_or_not boolean null comment '是否留级',
	last_login_time DATE null comment '上次登录时间',
	constraint users_pk
		primary key (id),
	constraint users___fk_iid
		foreign key (iid) references institutes (id)
);
create unique index users_unique_unumber_uindex
	on users (unique_unumber);


/*Table structure for table `roles_users` */
DROP TABLE IF EXISTS `roles_users`;
create table roles_users
(
	id int auto_increment,
	rid int null comment '角色id',
	uid int null comment '人员id',
	constraint roles_users_pk
		primary key (id),
	constraint roles_users___fk_rid
		foreign key (rid) references roles (id),
	constraint roles_users___fk_uid
		foreign key (uid) references users (id)
);


/*Table structure for table `lesson_categories` */
DROP TABLE IF EXISTS `lesson_categories`;
create table lesson_categories
(
	id int auto_increment,
	cname varchar(5) null comment '类别名',
	constraint lesson_categories_pk
		primary key (id)
);


/*Table structure for table `lessons` */
DROP TABLE IF EXISTS `lessons`;
create table lessons
(
	id int auto_increment,
	lname varchar(20) null comment '课程名',
	iid int null comment '开设院系id',
	unique_lnumber varchar(20) null comment '唯一课程号',
	start int null comment '从哪一周开始',
	end int null comment '在哪一周结束',
	weeks int null comment '课程周数',
	capability int null comment '课程最大人数',
	tid int null comment '教师id',
	cid int null comment '课程类别id',
	constraint lessons_pk
		primary key (id),
	constraint lessons___fk_cid
		foreign key (cid) references lesson_categories (id),
	constraint lessons___fk_iid
		foreign key (iid) references institutes (id),
	constraint lessons___fk_tid
		foreign key (tid) references users (id)
);
create unique index lessons_unique_lnumber_uindex
	on lessons (unique_lnumber);


/*Table structure for table `teachers_lessons` */
DROP TABLE IF EXISTS `teachers_lessons`;
create table teachers_lessons
(
	id int auto_increment,
	tid int null comment '教师id',
	lid int null comment '课程id',
	constraint teachers_lessons_pk
		primary key (id),
	constraint teachers_lessons___fk_lid
		foreign key (lid) references lessons (id),
	constraint teachers_lessons___fk_tid
		foreign key (tid) references users (id)
);


/*Table structure for table `grades` */
DROP TABLE IF EXISTS `grades`;
create table grades
(
	id int auto_increment,
	sid int null comment '学生id',
	tid int null comment '教师id',
	lid int null comment '课程id',
	cid int null comment '课程类别id',
	score int null comment '分数',
	pass_or_not boolean null comment '是否合格',
	retake_or_not boolean null comment '是否是重修',
	constraint grades_pk
		primary key (id),
	constraint grades___fk_cid
		foreign key (cid) references lesson_categories (id),
	constraint grades___fk_lid
		foreign key (lid) references lessons (id),
	constraint grades___fk_sid
		foreign key (sid) references users (id),
	constraint grades___fk_tid
		foreign key (tid) references users (id)
);


/*Table structure for table `choices` */
DROP TABLE IF EXISTS `choices`;
create table choices
(
	id int auto_increment,
	sid int null comment '学生id',
	lid int null comment '课程id',
	constraint choices_pk
		primary key (id),
	constraint choices___fk_lid
		foreign key (lid) references lessons (id),
	constraint choices___fk_sid
		foreign key (sid) references users (id)
);


/*Table structure for table `exams` */
DROP TABLE IF EXISTS `exams`;
create table exams
(
	id int auto_increment,
	lid int null comment '课程id',
	cid int null comment '课程类别id',
	exam_time DATE null comment '考试时间',
	reexam_or_not boolean null comment '是否为补考考试',
	constraint exams_pk
		primary key (id),
	constraint exams___fk_cid
		foreign key (cid) references lesson_categories (id),
	constraint exams___fk_lid
		foreign key (lid) references lessons (id)
);


/*Table structure for table `reexams` */
DROP TABLE IF EXISTS `reexams`;
create table reexams
(
	id int auto_increment,
	sid int null comment '学生id',
	lid int null comment '课程id',
	score int null comment '分数',
	retake_time DATE null comment '补考时间',
	constraint reexams_pk
		primary key (id),
    constraint reexams___fk_lid
		foreign key (lid) references lessons (id),
	constraint reexams___fk_sid
		foreign key (sid) references users (id)

);


/*Table structure for table `scholarships` */
DROP TABLE IF EXISTS `scholarships`;
create table scholarships
(
	id int auto_increment,
	schname varchar(10) null comment '奖学金名',
	money int null comment '奖金',
	description text null comment '描述',
	constraint scholarships_pk
		primary key (id)
);


/*Table structure for table `applications` */
DROP TABLE IF EXISTS `applications`;
create table applications
(
	id int auto_increment,
	sid int null comment '学生id',
	schid int null comment '奖学金id',
	time DATE null comment '申请时间',
	approve_or_not boolean null comment '是否通过',
	reviews text null comment '审批概述',
	constraint applications_pk
		primary key (id),
	constraint applications___fk_schid
		foreign key (schid) references scholarships (id),
	constraint applications___fk_sid
		foreign key (sid) references users (id)
);