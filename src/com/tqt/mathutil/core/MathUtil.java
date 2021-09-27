/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tqt.mathutil.core;

/**
 *
 * @author PC
 */
public class MathUtil {
    // viết hàm toán học tính giai thừa n! 1.2.3....n
    // quy ước: 0! = 1! = 1
    // 21! tràn kiểu long, long: 18 số 0
    // túm lại: hàm tính giai thừa của n - 0..20
    // ta xài kĩ thuật TDD- Test Driven Development
    //                      Test Fisrt Develoment
    // ta nghĩ về test, kịch bản test, bộ dữ liệu test trruowcs khi code
    
    public static long getFactorial(int n){
       if (n < 0 || n > 20)
           throw new IllegalArgumentException("n must be 0..20");
       if (n == 0 || n == 1)
           return 1;
        long product = 1;
        
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    
    // sure, getF(5) -> 120
    //       getF(6) -> 720
}
