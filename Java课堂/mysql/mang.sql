SELECT * FROM emp,dept
SELECT * FROM emp,dept
	WHERE emp.deptno=dept.deptno;
SELECT ename,sal,dname
	FROM emp,dept
	WHERE emp.deptno=dept.deptno;
SELECT ename,sal,dname,emp.deptno
	FROM emp,dept
	WHERE emp.deptno=dept.deptno;

SELECT * FROM salgrade;
SELECT ename,sal,grade
	FROM emp,salgrade
	WHERE sal BETWEEN losal AND hisal
SELECT ename ,sal,dname,emp.deptno
	FROM emp,dept
	WHERE emp.deptno=dept.deptno 
	ORDER BY emp.deptno DESC
SELECT * 
	FROM emp worker,emp boss
SELECT worker.ename,boss.ename
	FROM emp worker,emp boss;
SELECT worker.ename AS '员工表',boss.ename AS '上级表'
	FROM emp worker,emp boss
	WHERE worker.mgr=boss.empno;
	
	