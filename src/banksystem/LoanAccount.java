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
public class LoanAccount extends Account {
    
    public LoanAccount(double balance, int interestRate, Customer customer) {
        super(balance, interestRate, customer);
    }

    @Override
    double calculateInterestAmount(int number_of_months, int interestRate) {
           double calculateInterestAmount = 0;
        double calculateInterestAmountPerMonth = 0;
        //calculate interest amount for each month and then sum them
         for (int i = 0; i < number_of_months; i++) {
               calculateInterestAmountPerMonth =  getCustomer().getCustomerInterestPerMonth(i, interestRate);
                calculateInterestAmount = calculateInterestAmountPerMonth + calculateInterestAmount;
        
    }
     return calculateInterestAmount;
       

}

    
}
