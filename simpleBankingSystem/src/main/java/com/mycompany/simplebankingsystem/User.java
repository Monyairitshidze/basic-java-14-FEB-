
package com.mycompany.simplebankingsystem;

import java.util.Random;
import java.util.Scanner;

public class User {
    
     String account_name;
     String address;
     Long account_number;
     String id;
     String surname;
     String name;
    
    public void bankAccount(){
        
        //creating an object of the scanner class so we can use it
        Scanner sc = new Scanner(System.in);
        
        //accepting user input
        System.out.println("YOUR NAME:");
        name = sc.next();
        
        System.out.println("YOUR SURNAME:");
        surname = sc.next();
        
        System.out.println("YOUR ID:");
        id = sc.next();
        
        System.out.println("YOUR ADDRESS:");
        address = sc.next();
        
        account_name = name;
        
        
    }
    
   public void generateAccountNumbers(){
       
       Random rm = new Random();
       
      account_number = rm.nextLong(1234567890);
   }
   
   public void  display(){
       
       System.out.println("DETAILS OF THE USER ARE:");
       System.out.println("Name: "+ name);
       System.out.println("Surname: " + surname);
       System.out.println("Id: " + id);
       System.out.println("Address: " + address);
       System.out.println("Account No: " +  account_number);
       
   }
    
}
