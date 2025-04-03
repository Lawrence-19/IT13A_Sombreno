/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author ADMIN
 */
public class Lab_Act6_Fibonacci {
    public static void main(String[] args) {
        int m=10;
        
        for (int i=0; i<m;i++){
            System.out.print(fibonacci(i) + ", ");
        }
    }
    
    public static int fibonacci(int m){
        if(m <= 1){
            return m;
        }else {
            return fibonacci(m-1) + fibonacci(m-2);
        }
    }
}
