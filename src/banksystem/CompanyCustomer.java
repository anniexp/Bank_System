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
public class CompanyCustomer extends Customer {

//Loan accounts have no interest for the first 2 months if they are held by a company. 
    @Override
    double getCustomerInterestPerMonth(int month, int interestRate) {
        double calculateInterestAmountPerMonth = 0;
        if (month >= 2) {
            calculateInterestAmountPerMonth = interestRate;
        }
        return calculateInterestAmountPerMonth;
    }

    //Mortgage accounts have 1/2 interest for the first 12 months for companies.
    @Override
    double getCustomerInterestPerMonth(int month, double interestRate) {
        double calculateInterestAmountPerMonth;
        if (month < 12) {
            calculateInterestAmountPerMonth = (interestRate) / 2;
        } else {
            calculateInterestAmountPerMonth = (int) (interestRate);
        }
        return calculateInterestAmountPerMonth;
    }
}
