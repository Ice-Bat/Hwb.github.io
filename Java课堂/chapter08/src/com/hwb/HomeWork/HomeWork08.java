package com.hwb.HomeWork;

public class HomeWork08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(100);
//        checkingAccount.deposit(1001);
//        System.out.println(checkingAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.earnMonthlyInsert();
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBalance());
    }
}
