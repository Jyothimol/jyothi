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

public class Ascending

{
    
public static void main(String arg[])

    {

        int a[]=new int[10];

        int i;

        
        Scanner s=new Scanner(System.in);

        System.out.println("enter the limit");
 
       
        int n=s.nextInt();
        
       
 System.out.println("enter the numbers ");
      
  for(i=0;i<n;i++)
        
{

            a[i]=s.nextInt();

            
        }
        
System.out.println("numbers in ascending order");
    
  
         for(i=0;i<n;i++)
 
        {
     
        for(int j=i+1;j<n;j++)
    
         {
   
         if(a[i]>a[j])

            {
     
           int temp=a[j];
  
              a[j]=a[i];

                a[i]=temp;
    
        }
 
            }
  
          
         }
        
 for(i=0;i<n;i++)
     
    {
   
       System.out.println(a[i]);
  
      }
  
     
    }

}
