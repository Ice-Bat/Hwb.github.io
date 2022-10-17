SELECT * FROM emp;
SELECT deptno,AVG(sal)
	FROM emp
	GROUP BY deptno;
SELECT *
	FROM emp,(
	SELECT deptno,AVG(sal) AS sal_avg
	FROM emp
	GROUP BY deptno
	)temp
	WHERE emp.deptno=temp.deptno AND emp.sal>sal_avg;

SELECT deptno,MAX(sal)
	FROM emp
	GROUP BY deptno
SELECT * 
	FROM emp,(
	SELECT deptno,MAX(sal) AS max_sal
	FROM emp
	GROUP BY deptno)temp
	WHERE temp.deptno=emp.deptno AND emp.sal=temp.max_sal
	
SELECT * FROM dept;

SELECT deptno,COUNT(deptno) AS '人数'
	from emp
	group by deptno;
select *
	from dept,(
	SELECT deptno,COUNT(deptno) AS '人数'
	FROM emp
	GROUP BY deptno
	)temp
	where dept.deptno=temp.deptno;
	
	