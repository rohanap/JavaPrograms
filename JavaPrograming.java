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
 *Example: How to Print an Integer entered by an user
 */
public class JavaPrograming {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the user input");
        int userInput = Integer.parseInt(input.nextLine());
        System.out.println("User input numbers is: "+userInput);
    }
    
}
