/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

/**
 *
 * @author User
 */
    import java.util.Scanner;

public class Lab_Act2_JavaApp {
    
    public static void main(String[] args) {
        


            Scanner s=new Scanner(System.in);
            boolean u= true;
            while(u){
                System.out.print("Input the first number: ");
                int x = s.nextInt();
                
                System.out.print("Input the second number: ");
                int y =  s.nextInt();
                
                System.out.print("Input the third number: ");
                int z=  s.nextInt();
                
                    int greatest = Math.max(Math.max(x, y), z);
                    
                    System.out.println("The greatest number is: " + greatest);
                    
                    u=false;
                    
            }
       }
    }


