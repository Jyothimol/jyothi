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
public class Sumofdigits
   {
   
   
 
       public static void main(String args[])
       {
           int n,m=0,sum=0;
          // int a[]=new int[20];
           
           Scanner s=new Scanner(System.in);
           
           System.out.println("enter the number");
           n=s.nextInt();
           
           
           while(n>0)
           {
               m=n%10;
               sum=sum+m;
               n=n/10;
              // i++;
           }
          System.out.println("Sum is:" + sum);
       
       }
   }
