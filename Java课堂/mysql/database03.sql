#备份数据库（注意在：DOS执行mysqldump指令其实是在mysql安装目录\bin）命令行
#mysqldump -u 用户名 -p -B 数据库1 数据库2 数据库n > 文件名.sql
mysqldump -u root -p -B h_db01 > d:\\bak.sql
#恢复数据库（注意在：进入Mysql命令行在执行  mysql -u root -p）
source d:\\bak.sql
#第二个恢复方法，直接将bak。sql的内容复制粘贴进查询编辑器然后全选运行
#Source 文件名.sql
DROP DATABASE h_db01
#备份数据库的表
#mysqldump -u 用户名 -p 数据库 表1 表2 表n > 文件名.sql
mysqldump -u root -p h_db03 t1 > d:\\bak.sql
DROP DATABASE h_db03 t1