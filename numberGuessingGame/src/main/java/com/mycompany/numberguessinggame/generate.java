
package com.mycompany.numberguessinggame;

import java.util.Scanner;
import java.util.Random;

public class generate {
    
    int value;
    int numbers;
    
    Scanner sc = new Scanner(System.in);
    public void random() {
        
     
     
     int number = 100;
     Random r = new Random();
     
     //generating random number
     value = r.nextInt(number);
     
    }
    
   public void play(){
       
       for(int i=0; i<=100; i++){
        
           //accepting user input
        System.out.println("Enter Your Number ");
        numbers   = sc.nextInt();
        
        //decision making 
        if(numbers> value){
            
            System.out.println("The number is too big");
            System.out.println("BUT IT MIGHT CHANGE NOW");
            
        }
        
        
        else if(numbers == value){
            
            System.out.println("YOU WON");
            break;
            
        }
        
        
        else if(numbers< value){
            
            System.out.println("The number is small");
            System.out.println("DONT GIVEUP YOU MIGHT WIN"); 
        }
        
       }
       
   }
}
