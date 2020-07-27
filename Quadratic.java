/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograming;

/**
 *
 * @author rohan
 * 
    If determinant is greater than 0, the roots are real and different.
    If determinant is equal to 0, the roots are real and equal.
    If determinant is less than 0, the roots are complex and different.

 */
public class Quadratic {

    public static void main(String[] args) {

        double a = 2.3, b = 4, c = 5.6;
        double root1, root2;

        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {

            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            
            System.out.format("root1 = %.2f and root2 = %.2f;",root1,root2);
        }
        
        else if(determinant == 0){
        
           root1 = root2 = -b/(2 * a);
           
            System.out.format("root1 = root2 = %.2f;",root1);
        }
        
        else{
           
            double realPart = -b/(2 * a);
            double imaginaryPart = Math.sqrt(-determinant)/(2 * a);
            
            System.out.format("root1 = %.2f+5.2fi and root2 = %.2f-%.2fi", realPart,imaginaryPart,realPart,imaginaryPart);
        }

    }
}
