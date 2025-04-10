/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class RestaurantOrderingSystem {
    
    static Scanner s=  new Scanner(System.in);
    static final String FileName = "C:\\Users\\ADMIN\\Documents\\credentials.txt";
    static final int Shift = 3;
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("================================================================");
        System.out.println("          Welcome to the Restaurant ordering System!            ");
        System.out.println("================================================================");
     
        
//ask if the customer want to login or create a new account//
        System.out.println("[1] Create Account\n[2] Login");
        System.out.print("Enter choice: "); 
        int choice = s.nextInt();
        s.nextLine(); //Consume new line
        
        if(choice == 1){           
            CreateAcc();
       
        }else if(choice == 2){
            Login();
       
        }else{
            System.out.println("Login Failed");
        }      
    }
     
   public static void CreateAcc(){
       //Create Account for the Customer//
       System.out.println("Create New Account");
       
       //Ask the customer username and password//
       System.out.print("Enter Username: ");
       String NewU = s.nextLine();
       
       System.out.print("Enter New password: ");
       String NewP = s.nextLine();
       
       String encryptPass = encryptC(NewP,Shift);
       
       try{
           FileWriter Ca = new FileWriter(FileName);
           Ca.write(NewU + ", " + encryptPass + "/n");
           Ca.close();
           System.out.println("account created Successfully");
           
       }catch (IOException e) {
           System.out.println("Error Saving Account");
       }
   } 
   
   public static String encryptC(String message, int key){
       char[] chars= message.toCharArray();
       for(int i=0; i < chars.length; i++){
           chars[i] += key;
       }
        return new String(chars);   
   }
   
   public static boolean validate(String username, String password) throws FileNotFoundException, IOException{
      try{
       BufferedReader read = new BufferedReader(new FileReader(FileName));
       String line;
       
       while((line = read.readLine()) != null) {
           String[] credentials = line.split(": ");
           
           if(credentials.length == 2 && credentials[0].equals(username) && credentials[1].equals(password));
           read.close();
    
       }

       return true;
       
      }catch (IOException e) {
          System.out.println("An error occured");
      }
        return false;

   }
   
   public static void Login() throws IOException{
       
       System.out.print("Enter Username: ");
       String OldU = s.nextLine();
       
       System.out.print("Enter New password: ");
       String OldP = s.nextLine();
       
       if(validate(OldU,OldP)){
           System.out.println("Login Successfully");
           displayMenu();
       }else{
           System.out.println("Wrong Username of Password");
       }
   }
   public static void displayMenu() {
       
       int choice;
       int quantity;
       double totalPrice = 0;
       
       do{
           System.out.println("\n ========= Welcome to Java Diner=========");
           System.out.println("1. Pizza - ₱120");
           System.out.println("2. Burger - ₱50");
           System.out.println("3. Fries - ₱50");
           System.out.println("4. Exit");
           
           System.out.println("Choose an Item: ");
           choice = s.nextInt();
           
           System.out.println("Enter quantity: ");
           quantity = s.nextInt();
           
           
           switch(choice) {
               case 1:
                   System.out.println("Pizza");
                   totalPrice += 120;
                   break;
               case 2:
                   System.out.println("Burger");
                   totalPrice += 50;
                   break;
               case 3:
                   System.out.println("Fries");
                   totalPrice += 50;
                   break;
               case 4:
                   System.out.println("Thank you for Dining with us!");
                   break;
               default:
                   System.out.println("Invalid choice! Please select a valid option");
           
           }
           
       }while (choice !=4);
       
       if (totalPrice > 0){
           System.out.println("your total bill: " + totalPrice);
       }
       
   }
  
}
