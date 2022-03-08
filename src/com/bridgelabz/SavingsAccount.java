package com.bridgelabz;

/**
 * Creating class SavingsAccount and taking instance variables as annualInterestRate and savingsBalance
 */
public class SavingsAccount {
        private static double annualInterestRate;
        private double savingsBalance;

        /**
         * getter method for savingsBalance
         * @return - the savingsBalance
         */
        public double getSavingsBalance() {
                return savingsBalance;
        }

        /**
         * Setter method for savingsBalance
         * @param savingsBalance - taking savingsBalance as param
         */
        public void setSavingsBalance(double savingsBalance) {
                this.savingsBalance = savingsBalance;
        }

        /**
         * Creating calculateMonthlyInterest to calculate monthly interest rate
         */
        public void calculateMonthlyInterest() {
                this.savingsBalance = this.savingsBalance + (this.savingsBalance * annualInterestRate)/12;
        }

        /**
         * Creating modifyInterestRate to calculate the interest rate
         * @param annualInterestRate - taking annualInterestRate as param
         */
        public static void modifyInterestRate(int annualInterestRate) {
                SavingsAccount.annualInterestRate = annualInterestRate;
        }
}
