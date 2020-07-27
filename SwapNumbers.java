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
public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        //int temp = num1;
      
        System.out.println("number orders before swapping "+ num1 +" "+ num2);
        
        swap(num1, num2);
    }
    
    public static void swap(int a,int b){
      
        int num1 =b;
        int num2 =a;
        System.out.println("number after swaping "+num1 +" "+num2);
      
    }
}
