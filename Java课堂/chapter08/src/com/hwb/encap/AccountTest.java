package com.hwb.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("xiao");
        account.setBalance(103);
        account.setPassword("aaaaaaaa");
        account.showInfo();
        Account account1 = new Account("ss", 89, "vvvvvv");
        account1.showInfo();
    }
}
