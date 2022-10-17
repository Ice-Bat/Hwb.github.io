package com.hwb.encap;

public class Account {
    /*
    创建程序，在其中定义两个类：Account 和 AccountTest 体会java封装
    Account类要求具有属性：名字（长度2-4），余额（>20），密码（六位）
    通过setXxx给Account属性赋值
    在AccountTest类中测试
     */
    //属性
    private String name;
    private double balance;
    private String password;

    //构造器
    public Account() {

    }

    public Account(String name, double balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password );
    }

    //方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("请输入（2-4）长度的名字，默认值：无名");
            this.name = "无名";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 20) {
            System.out.println("余额错误，（>20），默认值：0");
            this.balance = 0;
        } else {
            this.balance = balance;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() != 6) {
            System.out.println("请输入6位值的密码，默认值：000000");
            this.password = "000000";
        } else {
            this.password = password;
        }
    }

    //显示
    public void showInfo() {
        System.out.println("name=" + name + " balance=" + balance + " password=" + password);
    }
}
