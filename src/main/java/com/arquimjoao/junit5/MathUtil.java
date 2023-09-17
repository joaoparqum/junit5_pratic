/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arquimjoao.junit5;

/**
 *
 * @author João P. Arquim
 */
public class MathUtil {
    
    public static int mdc(int x, int y) {
        
        if(y>0 && x % y == 0){
            return y;
        }
        
        if(y == 0){
            return Math.abs(x);
        }
        
        return -1;
    }
    
}
