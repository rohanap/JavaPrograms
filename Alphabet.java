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
public class Alphabet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter singel charecter");
        char ch = scan.nextLine().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a alphabet");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }
}
