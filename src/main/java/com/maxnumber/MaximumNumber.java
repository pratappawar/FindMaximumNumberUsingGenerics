package com.maxnumber;

public class MaximumNumber {
    /**
     * Compares two Integer objects numerically using compareTo Method
     * compare three number with each other
     *@return float maxNum to return maximum number
     * Here T is generic type which is common for all the datatype.Here we can achieve type safety
     */
    public <T extends Comparable> T checkMaximum(T num1, T num2, T num3) {
        T maxNum=num1;
        if (num2.compareTo(maxNum)>0){
            maxNum=num2;
        }
        if (num3.compareTo(maxNum)>0){
            maxNum=num3;
        }
        return maxNum;
    }

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("!!!Welcome To Maximum Number Program!!!");
    }
}
