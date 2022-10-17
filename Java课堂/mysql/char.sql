SELECT * FROM emp;

SELECT CHARSET(ename) FROM emp;
SELECT CONCAT(ename,' job is ',job ) FROM emp;
-- dual 亚元表 ，系统提供测试使用 
SELECT INSTR('huangweibing','bin') FROM DUAL;
  
SELECT UCASE(ename) FROM emp;
SELECT LCASE(ename) FROM emp;
SELECT LEFT(ename,2) FROM emp;
SELECT RIGHT(ename,3) FROM emp;
SELECT LENGTH(ename) FROM emp;
SELECT LENGTH('黄') ;
SELECT ename,REPLACE(job,'MANAGER','经理') FROM emp;
SELECT STRCMP('hwb','jwb') FROM DUAL;
SELECT SUBSTRING(ename,2,3) FROM emp;
SELECT RTRIM('   hhhh    ') FROM DUAL;
SELECT LTRIM('   hhhh    ') FROM DUAL;
SELECT TRIM('    hhhh    ') FROM DUAL;

SELECT CONCAT(LEFT(LCASE(ename),1),SUBSTRING(ename,2)) FROM emp;