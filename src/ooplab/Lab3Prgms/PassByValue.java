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

public class PassByValue

{

    void add(int a,int b)
   
 {
 
       int sum;
   
     sum=a+b;

        System.out.println("Sum is:"+sum);

    }

    public static void main(String args[])

    {

        int a,b;
  
      Scanner S=new Scanner(System.in);
    
    
        System.out.println("enter any two number");
   
     a=S.nextInt();
  
      b=S.nextInt();

        PassByValue P=new PassByValue();

        P.add(a,b);

        
    }

}
