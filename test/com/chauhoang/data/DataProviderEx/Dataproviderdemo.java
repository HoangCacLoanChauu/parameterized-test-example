/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chauhoang.data.DataProviderEx;

import com.chauhoang.core.TestPerfectNumber;
import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author hoang
 */
public class Dataproviderdemo {

   @DataProvider(name = "test")
   public static Object[][] perfectNumbers() {
      return new Object[][] {{6, true}, {8128, true}, {28, true}, {496, true}};
   }

   @Test(dataProvider = "test")
   public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
      System.out.println(inputNumber + " " + expectedResult);
      assertEquals(expectedResult, TestPerfectNumber.PerfectNumber(inputNumber));
   }

}
