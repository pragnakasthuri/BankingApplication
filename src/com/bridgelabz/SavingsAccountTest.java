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
         * 1.Creating new object for saver1 and saver2
         */
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        /**
         * 2.Setting savingsBalance for saver1 to 2000 and saver2 to 3000
         */
        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);

        /**
         * 3.Modifying interest rate as 4% to both saver1 and saver2
         */
        saver1.modifyInterestRate(4);
        saver2.modifyInterestRate(4);

        /**
         * 4.Calculating the MonthlyInterest for saver1 and saver2
         */
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        /**
         * 5.printing the savingsBalance of saver1 and saver2 with 4% interest
         */
        System.out.println("Saver1: New Balance with 4% interest rate: "+saver1.getSavingsBalance());
        System.out.println("Saver2: New Balance with 4% interest rate: "+saver2.getSavingsBalance());
        System.out.println();


        /**
         * 6.modifying interest rate as 5% to saver1
         */
        saver1.modifyInterestRate(5);
        /**
         * 7.Calculating the MonthlyInterest for saver1
         */
        saver1.calculateMonthlyInterest();
        /**
         * 8.printing the savingsBalance of saver1 with 5% interest
         */
        System.out.println("Saver1: New Balance with 5% interest rate: "+saver1.getSavingsBalance());


        /**
         * 9.modifying interest rate as 5% to saver2
         */
        saver2.modifyInterestRate(5);
        /**
         * 10.Calculating the MonthlyInterest for saver2
         */
        saver2.calculateMonthlyInterest();
        /**
         * 11.printing the savingsBalance of saver2 with 5% interest
         */
        System.out.println("Saver2: New Balance with 5% interest rate: "+saver2.getSavingsBalance());
    }
}
