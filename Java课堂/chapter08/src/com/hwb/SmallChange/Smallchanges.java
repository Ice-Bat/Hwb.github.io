package com.hwb.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Smallchanges {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        Scanner myscanner = new Scanner(System.in);
        //零钱通明细
        String str = "";
        String details = "======------零钱通明细------======";
        //收益入账
        double money = 0;
        double balance = 0;
        Date date = new Date();//输出时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm");
        //消费
        String note;
        do {
            System.out.println("======------零钱通菜单------======");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");

            System.out.println("请选择(1-4):");
            str = scanner.next();
            switch (str) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账:");
                    money = scanner.nextDouble();
                    if(money <= 0){
                        System.out.println("收益入账要大于0");
                        break;
                    }
                    balance += money;
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
                    System.out.println(details);
                    break;
                case "3":
                    System.out.println("消费说明:");
                    note = scanner.next();
                    System.out.println("支出金额:");
                    money = scanner.nextDouble();
                    if(money <= 0){
                        System.out.println("消费金额应为0-"+balance);
                        break;
                    }else if (money > balance) {
                        System.out.println("余额不足");
                        loop = false;
                        break;
                    } else {
                        balance -= money;
                        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
                        System.out.println(details);
                    }
                    break;
                case "4":
                    String confirm = "";
                    while (true) {
                        System.out.println("你确定要退出吗?y/n");
                        confirm = myscanner.next();

                        if ("y".equals(confirm) || "n".equals(confirm)){
                            break;
                        }
                    }
                    if ("y".equals(confirm)) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入选项不对，请重新输入");
            }
        } while (loop);
        System.out.println("退出零钱通系统");
    }
}
