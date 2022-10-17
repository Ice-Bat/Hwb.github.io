#演示bit的使用
#bit(m) m在0-64

CREATE TABLE t5(
	num BIT (8)
)
INSERT INTO t5 VALUES(2);
SELECT * FROM t5
SELECT * FROM t5 WHERE num =2;