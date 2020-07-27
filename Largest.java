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
public class Largest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 1st num");
        int num1 = scan.nextInt();
        System.out.println("Enter 2nd num");
        int num2 = scan.nextInt();
        System.out.println("Enter 3rd num");
        int num3 = scan.nextInt();
        
        System.out.println("num1 is "+num1);
        System.out.println("num2 is "+num2);
        System.out.println("num3 is "+num3);
        
        if(num1>num2 && num1>num3){
            System.out.println("num1 is largest");
        }else if(num2>num1 && num2>num3){
            System.out.println("num2 is largest");
        }else{
             System.out.println("num3 is largest");
        }
    }
}
