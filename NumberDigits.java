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
public class NumberDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count=0;
        
        for(int i=0;i<n;i++){
           count++;
        }
        System.out.println(count);
    }
}
