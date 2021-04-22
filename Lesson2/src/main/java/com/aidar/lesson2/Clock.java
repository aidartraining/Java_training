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
public class Clock {
    
    // Fields
    private int hours;
    private int minutes;
    private int seconds;
    
    // Constructor
    public Clock(int h, int m, int s) {
        if ((s >= 0 && s < 60) && (m >= 0 && m < 60) && (h >= 0 && h < 24)){
           hours = h; minutes = m; seconds = s; 
        } else {
           resetToMidnight();
        }
    }
    
    // Reset method
    public void resetToMidnight() {
        hours = 0; minutes = 0; seconds = 0;
    }
    
    // Check if morning method
    public boolean isMorning() {
        return hours > 12;
    }
    
    // Advance one second method
    public void tick() {
        if (seconds == 59) {
            seconds = 0;
            if (minutes == 59) {
                minutes = 0;
                if(hours == 23) {
                    resetToMidnight();
                } else {
                    hours++;
                }
            } else {
                minutes++;
            }
        } else {
            seconds++;
        }
    }
    
    public int getSeconds() {
        return seconds;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public int getHours() {
        return hours;
    }
    
    public void setSeconds(int sec) {
        if (sec >= 0 && sec < 60) {
            seconds = sec;
        }
    }
    
    public void setMinutes(int min) {
        if (min >= 0 && min < 60) {
            minutes = min;
        }
    }
    
    public void setHours(int h) {
        if (h >= 0 && h < 24) {
            hours = h;
        }
    }
    
    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
