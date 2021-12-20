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
abstract class Customer {

    abstract double getCustomerInterestPerMonth(int month, int interestRate);

    abstract double getCustomerInterestPerMonth(int month, double interestRate);

}
