/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chauhoang.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author hoang
 */
public class ParameterizedTest {
    
   @Test
   @Parameters("Parameter-suite-level")
   public void TestOne(String testOne) {
      System.out.println("Parameter-test-one value is : " + testOne);
   }
   
   @Test
   @Parameters("Parameter-test-two")
   public void TestTwo(String testTwo) {
      System.out.println("Parameter-test-two value is : " + testTwo);
   }
   
    @Test
   @Parameters({"Parameter-suite-level", "Parameter-test-three"})
   public void TestThree(String paramSuite, String paramThree) {
       // cùng tên param ở suite level thì param ở test level sẽ overide.
      System.out.println("Test three suite param is: " + paramSuite);
        System.out.println("Test three param is: " + paramThree);
   }
   
    
}
