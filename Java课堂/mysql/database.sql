#演示数据库的操作
#创建一个名称H_db01的数据库。【图形化和指令 演示】
#使用指令创建数据库
CREATE DATABASE H_db01;
#删除数据库
DROP DATABASE H_db01;
#创建一个使用utf8字符集的H_db02数据库
CREATE DATABASE H_db02 CHARACTER SET utf8
#创建一个使用utf8字符集，并带校对对规则的H_db03的数据库
CREATE DATABASE H_db03 CHARACTER SET utf8 COLLATE utf8_bin
#下面是一条查询的sql，select查询  *表示所有字段
SELECT * fromt1 WHERE NAME = 'tom'