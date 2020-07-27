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
public class SumNatural {
    public static void main(String[] args) {
        
        int num = 100;
        int sum=0;
        
        for(int i=1;i<=num;i++){
           sum+=i;
        }
        System.out.println("sum of natural number is: "+sum);
    }
}
