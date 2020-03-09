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
public class Triangledes
{
    public static void main(String a[])
    {
        int i,j,n;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the limit");
        n=Sc.nextInt();
        System.out.println("TRIANGLE IS");
        // System.out.println(n);
        for(i=n;i>=0;i--)
        {
         
            System.out.println(n);
            if(i==0)
            {
                break;
            }
            
            for(j=i-1;j<n;j++)
            {
                System.out.print(j);
            }
           
