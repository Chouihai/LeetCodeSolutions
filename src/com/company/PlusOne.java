package com.company;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] bruh = {1,2,3,4,5};
        System.out.println(Arrays.toString(plusOne(bruh)));
    }

    public static int[] plusOne(int[] digits) {

        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newArray = new int[digits.length+1];
        newArray[0] = 1;
        return newArray;
    }
}
