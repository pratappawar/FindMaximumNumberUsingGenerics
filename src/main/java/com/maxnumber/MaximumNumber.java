package com.maxnumber;

/**
 * declared Generic class with type T which has common for all data types
 * @param <T>
 */
public class MaximumNumber<T extends Comparable<T>> {

    T num1,num2,num3,num4,num5;//declare type Variable

    //parameterized constructor
    public MaximumNumber(T num1, T num2, T num3,T num4,T num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5=num5;
    }

    public T getCheckMaximum(){
        return MaximumNumber.checkMaximum(num1,num2,num3,num4,num5);
    }

    /**
     * Compares two Integer objects numerically using compareTo Method
     * compare three number with each other
     *@return float maxNum to return maximum number
     * Here T is generic type which is common for all the datatype.Here we can achieve type safety
     */
    public static<T extends Comparable> T checkMaximum(T num1, T num2, T num3,T num4,T num5) {
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
