/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author Sombreno & Bacalando
 */

public class lab_Act5_Calculator {
  
    public static int add(int a,int b){
        return a + b;
    }
    public static int sub(int a,int b){
        return a - b;
    }
    public static int Mult(int a,int b){
        return a * b;
    }
    public static int Div(int a,int b){
        return a / b;
    }
    public static float per(float c,float d){
        return c * (d/100);
        
    }
    
    public static void main(String[] args) {
        
        int result1 = add(5,5);
        System.out.println("Addition: " + result1);
        int result2 = sub(5,5);
        System.out.println("Subtraction: " + result2);
        int result3 = Mult(5,5);
        System.out.println("Multiplication: " + result3);
        int result4 = Div(5,5);
        System.out.println("Division: " + result4);
        float result5 = per(100,50);
        System.out.println("Percentage: " + result5 );
    }
    

    
}
