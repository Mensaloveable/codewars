//You are given an array (which will have a length of at least 3, but could be very large) containing integers.
// The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
// Write a method that takes the array as an argument and returns this "outlier" N.
//
//Examples
//[2, 4, 0, 100, 4, 11, 2602, 36]
//Should return: 11 (the only odd number)
//
//[160, 3, 1719, 19, 11, 13, -21]
//Should return: 160 (the only even number)
package com.loveable;

import java.util.*;
public class FindOutlier{
    static int find(int[] integers){
        int index = 0;
        List<Integer> another = new ArrayList<>();
        for (int i = 0; i < integers.length; ++i){
            another.add(Math.abs(integers[i]%2));
        }
        int even = Collections.frequency(another, 0);
        int odd = Collections.frequency(another, 1);
        if(even > odd){
            index = another.indexOf(1);
        } else {
            index = another.indexOf(0);
        }
        return integers[index];
    }
}