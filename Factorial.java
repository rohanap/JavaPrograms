/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograming;

import java.util.Scanner;

/**
 *
 * @author rohan
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        long fact=1;
        
        System.out.println("Enter the number");
        num = input.nextInt();
        
        for(int i=1;i<=num;i++){
           fact*=i;
        }
        System.out.println("Fact of number "+num+" is "+fact);
    }
}
