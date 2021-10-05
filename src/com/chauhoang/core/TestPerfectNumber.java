/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chauhoang.core;

/**
 *
 * @author hoang
 */
public class TestPerfectNumber {
    
    public static Boolean PerfectNumber(final int  a){
    int sum = 0;
    for(int i=1;i<=a/2;i++){
      if(a%i==0) 
        //tổng các ước số của a
        sum+=i;
    }
    if(sum==a)return true;
    return false;
  }
    
}
