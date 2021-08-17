package com.fu.mathutil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phien Truongg
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " +result);
        System.out.println("6! = 720; actual: " +MathUtil.getFactorial(6));
        System.out.println("5! = 1; actual: " +MathUtil.getFactorial(0));
        
        
        // Kĩ thuất kiểm thử phàn mềm: ước lượng giá trị trả về cửa hàm 
        // Expected value: 5! = 120 
        // hàm ai đó viết khi chạy  thự thế là mấy = actual
        // if expected == ectual, hàm ngon  
    }
}
