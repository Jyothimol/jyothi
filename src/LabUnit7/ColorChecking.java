/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabUnit7;

/**
 *
 * @author Me
 */

    import java.awt.*;

public class ColorChecking {
    public static void main(String args[])
    {
        Color rgb;
        rgb=new Color(193,255,183);
        int red,green,blue;
        red=rgb.getRed();
        green=rgb.getGreen();
        blue=rgb.getBlue();
        float x[]={0.0f,0.0f,0.0f};
        rgb.RGBtoHSB(red,green,blue,x);
        System.out.println("RGB Combination");
        System.out.println("Red:"+red+"Green:"+green+"Blue:"+blue);
        System.out.println( "Hue"+x[0]+"Saturation:"+x[1]+"Brightness:"+x[2]);
        int r=rgb.HSBtoRGB(0.75f,0.2375f,0.95f);
        System.out.println("HSB Combination");
        System.out.println("Red,Green,Blue Combination:"+r);
    }
}


