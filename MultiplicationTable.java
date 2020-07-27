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
public class MultiplicationTable {

    public static void main(String[] args) {

        int num = 5;
        int mul = 1;

        for (int i = 1; i <= 10; ++i) {
           mul= num * i;
            System.out.println(num +" * "+ i +" = "+mul);
        }
    }
}
