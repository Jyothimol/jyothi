/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab.Lab3Prgms;

/**
 *
 * @author MCALB01014
 */
import java.util.*;

public class Refer

{

    int x;

    void read(int x)

    {

        this.x=x;

        
        Scanner s=new Scanner(System.in);

        x=s.nextInt();
     
   
    }
 
   void display()
    
{
 
       System.out.println("X:"+x);
   
     
    }

    void add(Refer R2)

    {

        x=(x+R2.x);
 
       System.out.println("Sum is:"+x);
 
       
    }

    public static void main(String args[])

    {
   
     int x;
      
  Scanner s=new Scanner(System.in);

        
        System.out.println("enter the number");
  
      x=s.nextInt();
     
   
        Refer R1=new Refer();
     
   R1.read(x);
 
       R1.display();

        Refer R2= new Refer();
 
       R2.read(x);
  
      R2.display();

       // Refer R3=new Refer();
     
   R1.add(R2);
   
     
    }

}
