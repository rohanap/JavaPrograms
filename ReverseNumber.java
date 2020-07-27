/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author rohan
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int num =1234;
        int reversed = 0;
        
        while(num != 0){
          int digit = num % 10;
          reversed = reversed * 10 +digit;
          num/=10;
         
        }
        System.out.println(reversed);
        
       
    }
}
