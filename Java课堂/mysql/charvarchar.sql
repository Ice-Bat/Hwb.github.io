#使用字符类型char varchar
#注释快捷键 crtl + shift + c 取消 crtl +shift + r
-- char(size) 字符串 最大长度为255字符
-- varchar(size) 0-65535字节
-- 可变长度字符串 最大未65532字节 【utf8最大为21844字符 1-3个字节用于记录大小】
-- 如果码的编码utf8 varchar(size) size = (65535-3) \ 3 = 21844
CREATE TABLE t7(
	‘name‘ CHAR(255)
);
SELECT * FROM t7;

CREATE TABLE t8(
	‘name‘ VARCHAR (21844)
);

DROP TABLE t8;

CREATE TABLE t9(
	‘name‘ VARCHAR(32766) CHARACTER SET gbk
);