package com.deloitte.lab04.ex01;



public class App {
    public static void main(String[] args) {
        Person smith = new Person("Smith");
        Person kathy = new Person("Kathy");

        SavingsAccount smithAccount = new SavingsAccount(2000);
        CurrentAccount kathyAccount = new CurrentAccount(3000, 1000);
        smithAccount.deposit(2000);
        kathyAccount.withdraw(2000);

        System.out.println("Updated balance for " + smith.getName() + ": " + smithAccount.getBalance());
        System.out.println("Updated balance for " + kathy.getName() + ": " + kathyAccount.getBalance());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Account {
    private static int accountNumberGenerator = 1000; 
    private int accountNum;
    protected double balance;

    public Account(double initialBalance) {
        this.accountNum = accountNumberGenerator++;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNum() {
        return accountNum;
    }
}

class SavingsAccount extends Account {
    private final double minimumBalance = 500;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            return super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of " + minimumBalance + " required.");
            return false;
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            return super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Overdraft limit reached.");
            return false;
        }
    }
}
