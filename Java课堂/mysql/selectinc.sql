SELECT * FROM emp;
SELECT * FROM emp
	WHERE hiredate > '1991-1-1';
SELECT ename,sal FROM emp
	WHERE ename LIKE 'S%';
SELECT ename,sal FROM emp
	WHERE ename LIKE '__O%';
SELECT * FROM emp
	WHERE mgr IS NULL;
DESC emp;

SELECT * FROM emp
	ORDER BY sal;
SELECT * FROM emp
	ORDER BY deptno ASC,sal DESC;