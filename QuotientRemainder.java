/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograming;

/**
 *
 * @author rohan Compute Quotient and Remainder
 */
public class QuotientRemainder {

    public static void main(String[] args) {

        int dividend = 25;
        int divisor = 4;
        
        int quotient = dividend/divisor;
        int remainder = dividend%divisor;
        
        System.out.println(quotient);
        System.out.println(remainder);
    }
}
