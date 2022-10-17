#修改表的练习
-- 在员工表的emp上增加一个image  vsrchar类型 在resum后面
ALTER TABLE emp
	ADD image VARCHAR(32) NOT NULL DEFAULT '' 
	AFTER ‘resume‘
-- 显示表的结构
DESC emp;
-- 修改job列，改长为60
ALTER TABLE emp 
	MODIFY job VARCHAR(60) NOT NULL DEFAULT ''
-- 删除sex列
ALTER TABLE emp
	DROP sex;
-- 改表名为employ
RENAME TABLE emp TO employ
DESC employ 
-- 修改字符集为utf8
ALTER TABLE employ CHARACTER SET utf8
-- 改列名name 为 user_name 
 
--  插入insert语句
INSERT INTO ‘emp‘ VALUES(1,'hwb','男','2002-11-18','2010-10-18 22:22:22','买混沌',2222.222,'jhfddh');
INSERT INTO employ(id ,‘name‘,sex ,birthday ,entry_date ,job ,salary ,‘resume‘ )
	VALUES(10,'黄话','男','2002-10-12','2012-12-10 22:22:21','吃屎',20000,'hj');