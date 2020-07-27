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
public class EvenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int input = reader.nextInt();
        
        if(input%2==0){
            System.out.println(input +" number is Even");
        }else{
            System.out.println(input +" number is Odd");
        }
    }
}
