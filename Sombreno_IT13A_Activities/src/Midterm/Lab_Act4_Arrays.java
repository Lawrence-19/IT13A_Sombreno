/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author Sombreno
 */
public class Lab_Act4_Arrays {
    
    public static void main(String[] args) {
      
//Single Array
        char letters[] ={'A','B','C','D','E','F','G'};
        
        for(int i=0; i < letters.length; i++){
              System.out.print(letters[i] + ", ");
        }
        System.out.println();
        System.out.println();
        
//Multi-dimentional Array
        int numbers[][]={
                           {1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12}
        
        };
        
        for(int s=0; s<numbers.length; s++){
            System.out.print("The Elements in Row " + (s+1) + ": ");
            for(int y=0; y<numbers[s].length;y++){
                System.out.print(numbers[s][y] + " ");
            }
            System.out.println();
        }
        
    }
}
