
package com.mycompany.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class tasks {
    
    String task;
    String respond;
    
    
     //creating arraylist to stores tasks
     ArrayList <String> tasks = new ArrayList <>();
     
      Scanner sc;
    
    public void addTask(){
        
        //implement the object of scanner class so we can use it
        sc = new Scanner(System.in);
        
        do{
        
          //getting input from the user
        System.out.println("Enter your task");
        task = sc.next();
        
        //adding tasks to arrraylist
        tasks.add(task);
        
        
          //getting input from the user
        System.out.println("Do You Want to ADD another task");
        respond = sc.next();
        
        
            
        }
        
        //condition that controll our loop
        while(respond.equalsIgnoreCase("yes"));
      
    }
    
    public void display(){
        
        System.out.println("List of task:");
        for(int i=0; i<tasks.size(); i++){
       
        System.out.println(i + tasks.get(i));
       
        }
    }
    
    
    public void remove(){
        
        //printing all the tasks
        System.out.println("List of task:");
        for(int i=0; i<tasks.size(); i++){
        
        System.out.println(i + tasks.get(i) );
        }
        
        //asking the user to enter task that they want to remove
        System.out.println("Enter task you want to remove");
        int remove = sc.nextInt();
        
        //using the for loop to capture index to be removed then remove the index
        for(int j=0; j<tasks.size(); j++){
            
            if(remove == j){
                
                tasks.remove(j);
            }
        }
        
    }
    
}
