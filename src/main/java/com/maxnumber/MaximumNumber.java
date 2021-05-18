package com.maxnumber;

public class MaximumNumber {
    /**
     * Compares two Integer objects numerically using compareTo Method
     * compare three number with each other
     * Returns:
     * the value 0 if this Integer is equal to the argument Integer
     * a value less than 0 if this Integer is numerically less than the argument Integer;
     * and a value greater than 0 if this Integer is numerically greater than the argument Integer
     */
    public Integer MaximumNumber(Integer num1, Integer num2, Integer num3) {
        Integer maxNum=num1;
        if (num2.compareTo(maxNum)>0){
            maxNum=num2;
        }
        if (num3.compareTo(maxNum)>0){
            maxNum=num3;
        }
        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println("!!!Welcome To Maximum Number Program!!!");
    }
}
