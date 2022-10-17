SELECT COUNT(*),AVG(sal),job
	FROM emp
	GROUP BY job
SELECT COUNT(*) , COUNT(comm)
	FROM emp;
SELECT COUNT(*),COUNT(IF(comm IS NULL,1,NULL))
	FROM emp;
SELECT COUNT(DISTINCT mgr)
	FROM emp;
	
SELECT deptno,AVG(sal) AS sal_avg
	FROM emp
	GROUP BY deptno
	HAVING sal_avg>1000
	ORDER BY sal_avg DESC
	LIMIT 0,2;