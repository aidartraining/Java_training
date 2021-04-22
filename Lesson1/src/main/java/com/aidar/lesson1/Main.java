/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aidar.lesson1;

import java.util.*;

/**
 *
 * @author aidar
 */
public class Main {
    
    public static void main(String[] args) {
        int l, w, h;
        int volume, area;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Task 1");
        
        System.out.println("Length: ");
        l = in.nextInt();
        
        System.out.println("Width: ");
        w = in.nextInt();
        
        System.out.println("Height: ");
        h = in.nextInt();
        
        volume = l*w*h;
        area = 2*l*w + 2*l*h + 2*h*w;
        
        System.out.println("Volume is equal: " + volume);
        System.out.println("Surface area is equal: " + area);
        
        System.out.println("\nTask 2");
        
        double r, circ, ar;
        double pi = 3.14;
        
        System.out.println("Radius: ");
        r = in.nextDouble();
        
        circ = 2*pi*r;
        ar = pi*r*r;
        
        System.out.println("Circumference is equal: " + circ);
        System.out.println("Area is equal: " + ar);
    }
    
}
