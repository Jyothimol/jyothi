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
public class Simpleobject

{
   
 String y;
  
  Simpleobject(String y)
    
{
      
  this.y=y;

        System.out.println(y);

    }
  
  Simpleobject()

    {
      
  System.out.println("welcome to");

    }

    Simpleobject(String z,String x)
   
 {
        System.out.println(z);

        System.out.println(x);
    }
   
 public static void main(String args[])
  
  {
        
String y="hai";
     
   String z= "SNGCE";
   
     String x="MCA ";
    
    Simpleobject O=new Simpleobject(y);
   
     Simpleobject O1=new Simpleobject();
 
       Simpleobject O2=new Simpleobject(z,x);
     
   
        
    }
}
