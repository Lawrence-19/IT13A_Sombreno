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

public class Lab_act1_Arithmetics {
    public static void main(String[] args){
    
        Scanner s= new Scanner(System.in);
        
        System.out.print("Input first number:");
        int x= s.nextInt();
        
        System.out.print("Input Second number:");
        int y= s.nextInt();
        
        System.out.print("Input Third number:");
        int z= s.nextInt();
        
        
        int One= x*y+z;
        int Two=(x-y)%z;
        int Three=(x+y+z)/3;
        int Four=x*z-(y*y);
        
        
        System.out.println("10 * 4 + 6      =" + One);
        System.out.println("(10 - 4) % 6    =" + Two);
        System.out.println("(10 + 4 + 6)/ 3 =" + Three);
        System.out.println("10 * 5 - (4-4)  =" + Four);
    
    }
}
