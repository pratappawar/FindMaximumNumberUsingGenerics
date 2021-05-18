package com.maxnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {

    MaximumNumber maximum = new MaximumNumber(); //creating object of MaximumNumber Class
    Integer max;
    Float float_max;

    /**
     * in this test case checking 1st position number is max or not
     * if it max then it will return the same
     */
    @Test
    public void givenMaxNumber1stPosition_returnSameNumber() {
        max = maximum.maximumNumber(12, 9, 7);
        Assertions.assertEquals(12, max);
    }

    /**
     * in this test case checking 2nd position number is max or not
     * if it max then it will return the same
     */
    @Test
    public void givenMaxNumber2nd_Position_returnSameNumber() {
        max = maximum.maximumNumber(12,23,15);
        Assertions.assertEquals(23, max);
    }

    /**
     * in this test case checking 3rd position number is max or not
     * if it max then it will return the same
     */
    @Test
    public void givenMaxNumber3rd_Position_returnSameNumber(){
        max=maximum.maximumNumber(12,23,35);
        Assertions.assertEquals(35,max);
    }

    //*************************Test Cases for Floats****************************//

    @Test
    public void given_3_floatNumber_1stPosition_returnSameNumber(){
        float_max=maximum.maximumNumber(12.2f,9.2f,3.4f);
        Assertions.assertEquals(12.2f,float_max);
    }

    @Test
    public void given_3_floatNumber_2ndPosition_returnSameNumber(){
        float_max=maximum.maximumNumber(12.2f,15.8f,3.4f);
        Assertions.assertEquals(15.8f,float_max);
    }

    @Test
    public void given_3_floatNumber_3rdPosition_returnSameNumber(){
        float_max=maximum.maximumNumber(12.2f,15.8f,30.4f);
        Assertions.assertEquals(30.4f,float_max);
    }

}
