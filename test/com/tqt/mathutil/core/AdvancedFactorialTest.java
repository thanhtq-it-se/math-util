/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tqt.mathutil.core;

import static com.tqt.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author PC
 */
// ta sẽ dùng kĩ thuật data driven testing/ parameterzed testing
// tham số hóa bộ dữ liệu test
// là  kĩ thuật test dữu liệu ra hẳn câu lệnh kiểm thử
// xét chi bài getF()
// bộ data;
// đặt trong txt, excel, table/db
// 0 -> 1;
// 1 -> 1;
// 2 -> 2;
// 3 -> 6;
// 4 -> 24;
// 5 -> 120;
// nhồi/till bộ data vào trong lời gọi hàm getF() || assertEquals
// tách bạch data và lời gọi hàm check kết quả
@RunWith (value = Parameterized.class)
public class AdvancedFactorialTest {
  // chuẩn bị bộ data, ở txt hoặc excel, database
  // nếu để file ngoài, thì phải viết đoạn code để đọc data
  @Parameters  
  public static Object[][] initData(){
     return new Integer[][]{
                            {0, 1},
                            {1, 1},
                            {2, 2},
                            {3, 6},
                            {4, 24},
                            {6, 720},
                           };
  }
  @Parameter(value = 0)
  public int n; // bạn muốn tính mấy giai thừa
  @Parameter(value = 1)
  public long expected; // bạn kì vọng giai thừa trả về mấy
  
  @Test
  public void checkFactorialGivenRightArgumentReturnsWell(){
    assertEquals(expected, getFactorial(n));   
      
 } 
}
