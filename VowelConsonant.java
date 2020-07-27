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
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter single char: ");
        char input = scan.nextLine().charAt(0);
        
        switch(input){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println(input +" is Vowel");
                break;
                default:
                    System.out.println(input +" is Constant");
        }
    }
}
