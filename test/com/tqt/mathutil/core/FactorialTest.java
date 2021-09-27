/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tqt.mathutil.core;

import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author PC
 */
public class FactorialTest {
    
  @Test // biến 1 hàm kèm Annotation thành hàm main()
 public void checkFactorialGivenRightArgumentReturnsWell(){
    long expected  = 120; // hi vọng trả về 120
    long actual = MathUtil.getFactorial(5);
    
    Assert.assertEquals(expected, actual);
   
    Assert.assertEquals(720, MathUtil.getFactorial(6));   
    Assert.assertEquals(1, MathUtil.getFactorial(0));
    
 } 
    // bắt xem hàm có ném về ngoại lệ như thuofng lệ
    // vd: getF(-5) -> ném ra ngoại lệ
    // nếu gọi hàm getF(-5) mà ném ra ngoại lệ tương ứng -> đúng
    // hàm dc thiết kế đưa vào âm thì ném ra ngooaij lệ, khi chạy nó ném ra thật
    // có nghĩa hàm đúng như kì vọng
    // junit 4 coi ngoại lệ ko là giá trị, ko assertEquals(ngoại lệ, actual)

 @Test (expected = IllegalArgumentException.class) 
    public void checkFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5); // phải ném ra ngoại lệ
        
    }
 
}
