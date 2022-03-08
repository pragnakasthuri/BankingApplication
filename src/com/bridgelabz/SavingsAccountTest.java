package com.bridgelabz;

/**
 * Creating SavingsAccountTest to test the SavingsAccount
 */

public class SavingsAccountTest {

    /**
     * Main method to modify the savingsBalance by setting different rate of interest
     * @param args - default java param
     */
    public static void main(String[] args) {

        /**
         * 1.Creating new object for saver1
         */
        SavingsAccount saver1 = new SavingsAccount();
        /**
         * 2.Setting savingsBalance to 2000
         */
        saver1.setSavingsBalance(2000);
        /**
         * 3.Taking interest rate as 4%
         */
        saver1.modifyInterestRate(4);
        /**
         * 5.Calculating the MonthlyInterest
         */
        saver1.calculateMonthlyInterest();
        /**
         * 6.printing the savingsBalance of saver1 with 4% interest
         */
        System.out.println("Saver1: New Balance with 4% interest rate: "+saver1.getSavingsBalance());


        /**
         * 7.Creating new object for saver2
         */
        SavingsAccount saver2 = new SavingsAccount();
        /**
         * 8.Setting savingsBalance to 3000
         */
        saver2.setSavingsBalance(3000.00);
        /**
         * 9.Taking interest rate as 4%
         */
        saver2.modifyInterestRate(4);
        /**
         * 10.Calculating the MonthlyInterest
         */
        saver2.calculateMonthlyInterest();
        /**
         * 11.printing the savingsBalance of saver2 with 4% interest
         */
        System.out.println("Saver2: New Balance with 4% interest rate: "+saver2.getSavingsBalance());
        System.out.println();

        /**
         * 12.Taking interest rate as 5%
         */
        saver1.modifyInterestRate(5);
        /**
         * 13.Calculating the MonthlyInterest
         */
        saver1.calculateMonthlyInterest();
        /**
         * 14.printing the savingsBalance of saver1 with 5% interest
         */
        System.out.println("Saver1: New Balance with 5% interest rate: "+saver1.getSavingsBalance());


        /**
         * 15.Taking interest rate as 5%
         */
        saver2.modifyInterestRate(5);
        /**
         * 16.Calculating the MonthlyInterest
         */
        saver2.calculateMonthlyInterest();
        /**
         * printing the savingsBalance of saver2 with 5% interest
         */
        System.out.println("Saver2: New Balance with 5% interest rate: "+saver2.getSavingsBalance());
    }
}
