
package com.mycompany.studentgradecalculator;

import java.util.Scanner;

public class student {
    
    
    //declaring variables that will hold the grades
        byte maths;
        byte english;
        byte life_sciences;
        byte geography;
        
    //creating an object of the scanner class so we can use it
    Scanner sc = new Scanner(System.in);
    
    //creating the method to accept students marks for different subjects
    public void studentsMarks(){
       
        //accepting input from the user
        System.out.println("Enter Maths marks: ");
        maths = sc.nextByte();
        
        System.out.println("Enter English marks: ");
        english = sc.nextByte();
        
        System.out.println("Enter Life Sciences marks: ");
        life_sciences = sc.nextByte();
        
        System.out.println("Enter Geography marks: ");
        geography = sc.nextByte();
        
    }
    
    public  void calaculate(){
       
    //declaring variables to hold data
      int total;
      double percentage;
      String grade;
      
      total = maths + english + life_sciences + geography;
      
      System.out.println("THE STUDENT GOT: " + total + " Marks");
      
      percentage = (double)total/400*100;      
      System.out.println("THE STUDENT GOT: " + percentage + " percentage");  
      
      
      if(percentage <=50){
          
          grade = "D";
          
       System.out.println("THE STUDENT GOT: " + grade);
      }
      
      else if(percentage >50 && percentage <=60){
          
           grade = "C-";
          
       System.out.println("THE STUDENT GOT: " + grade);
      }
      
       else if(percentage >60 && percentage <=70){
          
           grade = "C+";
          
       System.out.println("THE STUDENT GOT: " + grade);
      }
      
       else if(percentage >70 && percentage <=80){
          
           grade = "B";
          
       System.out.println("THE STUDENT GOT: " + grade);
      }
      
       else if(percentage >80 && percentage <=94){
          
           grade = "A";
          
       System.out.println("THE STUDENT GOT: " + grade);
      }
      
      
      else if(percentage >94 && percentage <=100){
          
           grade = "A+";
          
       System.out.println("THE STUDENT GOT: " + grade);
      }
    }
    
}
