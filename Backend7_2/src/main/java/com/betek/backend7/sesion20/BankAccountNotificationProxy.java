package com.betek.backend7.sesion20;

public class BankAccountNotificationProxy implements BankAccount {

        private BankAccount bankAccount;

        public BankAccountNotificationProxy(BankAccount bankAccount) {
            this.bankAccount = bankAccount;
        }

        @Override
        public String getAccountId() {
            return bankAccount.getAccountId();
        }

        @Override
        public void deposit(double amount) {
            bankAccount.deposit(amount);
            System.out.println("Notification: Deposit of " + amount + " to account " + getAccountId());
        }

        @Override
        public void withdraw(double amount) {
            bankAccount.withdraw(amount);
            System.out.println("Notification: Withdraw of " + amount + " from account " + getAccountId());
        }

        @Override
        public double getBalance() {
            return bankAccount.getBalance();
        }

        @Override
        public void transfer(double amount, BankAccount toAccount) {
            bankAccount.transfer(amount, toAccount);
            System.out.println("Notification: Transfer of " + amount + " from account " + getAccountId() + " to account " + toAccount.getAccountId());
        }

        @Override
        public void cancel() {
            bankAccount.cancel();
            System.out.println("Notification: Cancel of account " + getAccountId());
        }
}
