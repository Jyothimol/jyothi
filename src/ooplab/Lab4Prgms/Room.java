/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab.Lab4Prgms;

/**
 *
 * @author MCALB01014
 */
import Lab3Prgms.*;
class House extends Room
{
   int room_no;
   String room_type;
   double room_area;
   boolean Ac_machines;
   //Room R=new Room();
       void create()
       {

          setdata();
       }
       void display()
       {
           displaydata();
       }
   public static void main(String args[])
   {
       House h=new House();
       h.create();
       h.display();
   }
       
}
