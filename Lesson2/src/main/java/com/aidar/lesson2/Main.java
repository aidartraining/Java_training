/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aidar.lesson2;

/**
 *
 * @author aidar
 */
public class Main {
    
    public static void main(String[] args) {
        Clock c1 = new Clock(12, 59, 58);
        System.out.println(c1);
        
        c1.tick();
        System.out.println(c1);
        
        c1.tick();
        System.out.println(c1+"\n");
        
        Clock c2 = new Clock(12, 58, 59);
        System.out.println(c2);
        
        c2.tick();
        System.out.println(c2+"\n");
        
        Clock c3 = new Clock(23, 59, 58);
        System.out.println(c3);
        
        c3.tick();
        System.out.println(c3);
        
        c3.tick();
        System.out.println(c3+"\n");
        
        Clock c4 = new Clock(24, 59, 58);
        System.out.println(c4);
    }
    
}
