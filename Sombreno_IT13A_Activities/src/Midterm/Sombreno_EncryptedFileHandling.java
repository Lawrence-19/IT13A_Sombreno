/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sombreno_EncryptedFileHandling {
    
     public static void main(String[] args) throws FileNotFoundException {
        
        File myObj= new File("C:\\Users\\ADMIN\\Documents\\Input.txt");
        Scanner myReader = new Scanner(myObj);
        int key = 7;
                
       while (myReader.hasNextLine()){
           String data = myReader.nextLine();
           String encrypt = encryptmessage(data,key);
           System.out.println("Text : " + data);
           System.out.println("Encrypt: " + encrypt);
           System.out.println();
        
       }
       myReader.close();
    }
     
     public static String encryptmessage(String message, int key){
         char[] chars= message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += key;
     }
        return new String(chars);
}
}