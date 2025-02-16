

package com.mycompany.todolist;

import java.util.Scanner;


public class TODOLIST {
    
    public static void main(String[] args) {
        
         String respond;
        
         //craeating an instance of the class
          tasks ts = new tasks();
        
         //implement the object of scanner class so we can use it
        Scanner sc = new Scanner(System.in);
        
        //displaying choices to choose for the user
        System.out.println("SELECT YOUR OPTION:");
        System.out.println("1.ADD TASK");
        System.out.println("2.DISPLAY TASK");
        System.out.println("3.REMOVE TASK");
        
        do{
        //getting input from the user
        System.out.println("ENTER YOUR CHOICE");
        int choice = sc.nextInt();
        
             //making the decisions using switch
             switch (choice) {
                 case 1:
                     ts.addTask();
                     break;
                 case 2:
                     ts.display();
                     break;
                 case 3:
                     ts.remove();
                     break;
                 default:
                     break;
             }
        
        //getting input from the user
        System.out.println("DO YOU WANT TO PERFORM OTHER TASKS???");
        respond = sc.next(); 
        }
        while(respond.equalsIgnoreCase("yes"));
    }
}
