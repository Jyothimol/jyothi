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
public class Room 
{
    int no;
    String type,ac;
    double area;
    void setdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Room no:");
        no=sc.nextInt();
        System.out.println("Room type:");
        type=sc.next();
        System.out.println("Ac Machine:");
        ac=sc.next();
        System.out.println("Area:");
        area=sc.nextInt();
    }
    void display()
    {
        System.out.println("Room Details");
        System.out.println("Room No="+no);
        System.out.println("Room Typr="+type);
        System.out.println("Room AC="+ac);
        System.out.println("Room Area="+area);
        
    }
    public static void main(String args[])
    {
        Room r=new Room();
        r.setdata();
        r.display();
    }
}
