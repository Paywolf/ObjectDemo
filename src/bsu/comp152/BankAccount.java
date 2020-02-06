package bsu.comp152;

public class BankAccount {
    private double balance;
    private float interestRate;

    public void deposit(double amount) {
        balance = balance + amount;
        // no var example = deposit(37); program will fail because deposit doesn't return anything
    }

    public double checkBalance(){
        return balance; //now curly brace isnt red because now returning

}
    public double addInterest(){ // access specifier public, return type double, empty parameter
        return interestRate;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    }

    // UML? Project? Slides?