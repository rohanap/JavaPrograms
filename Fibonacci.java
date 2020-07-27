/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograming;

/**
 *
 * @author rohan
 */
public class Fibonacci {

    public static void main(String[] args) {

        int t1 = 0;
        int temp = 0;
        int t2 = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(t1 + " ");
            temp = t1;
            t1 += t2;
            t2 = temp;

        }
    }
}
