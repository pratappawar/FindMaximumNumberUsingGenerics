package com.maxnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {

    MaximumNumber maximum = new MaximumNumber(); //creating object of MaximumNumber Class
    Integer max;

    /**
     * in this test case checking 1st position number is max or not
     * if it max then it will return the same
     */
    @Test
    public void givenMaxNumber1stPosition_returnSameNumber() {
        max = maximum.MaximumNumber(12, 9, 7);
        Assertions.assertEquals(12, max);
    }

    /**
     * in this test case checking 2nd position number is max or not
     * if it max then it will return the same
     */
    @Test
    public void givenMaxNumber2nd_Position_returnSameNumber() {
        max = maximum.MaximumNumber(12,23,15);
        Assertions.assertEquals(23, max);
    }

    /**
     * in this test case checking 3rd position number is max or not
     * if it max then it will return the same
     */
    @Test
    public void givenMaxNumber3rd_Position_returnSameNumber(){
        max=maximum.MaximumNumber(12,23,35);
        Assertions.assertEquals(35,max);
    }

}
