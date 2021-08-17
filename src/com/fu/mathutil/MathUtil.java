/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Phien Truongg
 */

// TA viết cái class để cung cấp tiện ích cho nơi khác dùng
// Khi ta cung cấp tiện ích cho nơi khác dùng, đó là lúc ta khong cần nhớ gì cả
// Cho riêng ta, hàm STATIC giúp làm điều này
public class MathUtil {
    
    // n! =  1.2.3.4.5.6.7....n
    // 0! = 1! = 1 
    //Không tính đc gia thừa cho số âm 
    // 20! vừa khớp kiểu Long, kiểu long tối ta 18 só 0
    // 21! lố kiểu long
    // nếu đưa vào âm hay 21! báo lỗi 
    // một ngoại lệ  chửi  IllegalArgumentException or Exception
    
    public static long getFactorial(int n) throws IllegalAccessException{
        if (n<0 || n>20) 
            throw new IllegalAccessException("Invalid argumetn");
        //Hàm dừng liền khg cần return
        
        if(n==0 || n== 2) return 1; //dừng ngay
        
        //chơi for hoặc đệ quy - recursion
        // kĩ thuật 1 con heo đất , ốc bưu nhồi thịt
        // i=1 ; i=2 i=3 ... i=n nhồi liên tục i vào tích
        long product = 1; 
        
        for (int i = 2; i <=n ; i++) {
            product *= i;
        }
        return product;
    }
}
