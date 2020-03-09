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
public class Trianglebin
{
    public static void main(String args[])
    {
        int i,j,n;
       
        Scanner Sc=new Scanner(System.in);
       
        System.out.println("enter the limit");
        n=Sc.nextInt();
        System.out.println("the binary triangle is:");
        
       //System.out.println("1");
        for(i=1;i<=n+1;i++)
        {
            System.out.println("1");
            if(i==n)
            {
                break;
            }
            

            System.out.print("1");

            for(j=0;j<i;j++)
            {
                
                System.out.print("0");
            }

        }
    }
   
}
