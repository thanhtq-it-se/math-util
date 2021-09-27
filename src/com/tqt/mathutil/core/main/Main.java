/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tqt.mathutil.core.main;

import com.tqt.mathutil.core.MathUtil;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args){
         System.out.println("0! = 1? " + MathUtil.getFactorial(0));
         System.out.println("1! = 1? " + MathUtil.getFactorial(1));
         System.out.println("5! = 120? " + MathUtil.getFactorial(5));
         
    }
}
