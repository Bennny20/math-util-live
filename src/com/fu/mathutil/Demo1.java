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
        System.out.println("0! = 1; actual: " +MathUtil.getFactorial(0));
        // Them code sau lan dau tien lam chuyen ay 17/8/2021
        System.out.println("1! = 1; actual: " +MathUtil.getFactorial(1));
        System.out.println("3! = 6; actual: " +MathUtil.getFactorial(3));
        
        // Kĩ thuất kiểm thử phàn mềm: ước lượng giá trị trả về cửa hàm 
        // Expected value: 5! = 120 
        // hàm ai đó viết khi chạy  thự thế là mấy = actual
        // if expected == ectual, hàm ngon  
    }
}
