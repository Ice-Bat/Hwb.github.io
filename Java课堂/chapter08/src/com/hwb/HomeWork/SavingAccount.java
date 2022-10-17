package com.hwb.HomeWork;

public class SavingAccount extends BankAccount {
    private int chance = 3;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public void earnMonthlyInsert() {
        super.deposit(getBalance() * 0.01);
        chance = 3;
    }

    @Override
    public void deposit(double amount) {
        if (chance > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        chance--;
    }

    @Override
    public void withdraw(double amount) {
        if (chance > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        chance--;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }


}
