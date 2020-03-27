/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab.Lab2Prgms;

/**
 *
 * @author MCALB01014
 */
import java.util.*;
public class Prime
   {
   
   
 
       public static void main(String args[])
       {
           int n,i=1,p=0;
           Scanner s=new Scanner(System.in);
           System.out.println("enter a number");
           n=s.nextInt();
           while(i<=n)
           {
               if(n%i==0)
               {
               p++;
               }
               i++;
           }
        if(p==2)
        {
            System.out.println("prime number");
           
        }
        else
        {
            System.out.println("not pime");
        }
       }
   }

