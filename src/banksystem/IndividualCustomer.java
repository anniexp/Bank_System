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
public class IndividualCustomer extends Customer {

//Loan accounts have no interest for the first 3 months if they are held by individuals
    @Override
    double getCustomerInterestPerMonth(int month, int interestRate) {
        double calculateInterestAmountPerMonth = 0;
        if (month >= 3) {
            calculateInterestAmountPerMonth = interestRate;
        }

        return calculateInterestAmountPerMonth;

    }

//Mortgage accounts  no interest for the first 6 months for individuals.
    @Override
    double getCustomerInterestPerMonth(int month, double interestRate) {
        double calculateInterestAmountPerMonth = 0;
        if (month >= 6) {
            calculateInterestAmountPerMonth = (int) interestRate;
        }
        return calculateInterestAmountPerMonth;
    }

}
