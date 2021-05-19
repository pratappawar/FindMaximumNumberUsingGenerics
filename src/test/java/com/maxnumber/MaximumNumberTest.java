package com.maxnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {

    /**
     * in this test case checking 1st position number is max or not
     * if it max then it will return the same
     */
    @Test
    public void givenMaxNumber1stPosition_returnSameNumber() {
        Integer max = MaximumNumber.checkMaximum(12, 9, 7);
        Assertions.assertEquals(12, max);
    }

    /**
     * in this test case checking 2nd position number is max or not
     * if it max then it will return the same
     */
    @Test
    public void givenMaxNumber2nd_Position_returnSameNumber() {
        Integer max = (Integer) new MaximumNumber(12,23,15).getCheckMaximum();
        Assertions.assertEquals(23, max);
    }

    /**
     * in this test case checking 3rd position number is max or not
     * if it max then it will return the same
     */
    @Test
    public void givenMaxNumber3rd_Position_returnSameNumber(){
        Integer max= (Integer) new MaximumNumber(12,23,35).getCheckMaximum();
        Assertions.assertEquals(35,max);
    }

    //*************************Test Cases for Floats ****************************//

    @Test
    public void given_3_floatNumber_1stPosition_returnSameNumber(){
        Float float_max= (Float) new  MaximumNumber(12.2f,9.2f,3.4f).getCheckMaximum();
        Assertions.assertEquals(12.2f,float_max);
    }

    @Test
    public void given_3_floatNumber_2ndPosition_returnSameNumber(){
        Float float_max= (Float) new MaximumNumber(12.2f,15.8f,3.4f).getCheckMaximum();
        Assertions.assertEquals(15.8f,float_max);
    }

    @Test
    public void given_3_floatNumber_3rdPosition_returnSameNumber(){
        Float float_max= (Float) new MaximumNumber(12.2f,15.8f,30.4f).getCheckMaximum();
        Assertions.assertEquals(30.4f,float_max);
    }

    //*************************[Test Cases for Strings]****************************//
    @Test
    public void given_3_Strings_1stPosition_returnSameString(){
        String string_max= (String) new MaximumNumber("Orange","Apple","Banana").getCheckMaximum();
        Assertions.assertEquals("Orange",string_max);
    }

    @Test
    public void given_3_Strings_2ndPosition_returnSameString(){
        String string_max= (String) new MaximumNumber("Orange","Watermelon","Banana").getCheckMaximum();
        Assertions.assertEquals("Watermelon",string_max);
    }

    @Test
    public void given_3_Strings_3rdPosition_returnSameString(){
        String string_max= (String) new MaximumNumber("Orange","Banana","Watermelon").getCheckMaximum();
        Assertions.assertEquals("Watermelon",string_max);
    }

}
