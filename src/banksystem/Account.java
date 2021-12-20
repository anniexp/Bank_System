/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

/**
 *
 * @author Lenovo
 */
abstract class Account {

    private double balance;
    private int interestRate;
    Customer customer;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Account(double balance, int interestRate, Customer customer) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.customer = customer;
    }

//All accounts can calculate their interest amount for a given period (in months)
//In the common case its is calculated as follows: number_of_months * interest_rate.
    abstract double calculateInterestAmount(int number_of_months, int interestRate);

    public void depositMoney(double sum) {
        setBalance(getBalance() + sum);

    }
;

}
