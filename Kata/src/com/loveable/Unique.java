//There is an array with some numbers. All numbers are equal except for one. Try to find it!
//
//Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
//Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
//It’s guaranteed that array contains at least 3 numbers.
//
//The tests contain some very huge arrays, so think about performance.
//
//This is the first kata in series:
//
//Find the unique number (this kata)
//Find the unique string
//Find The Unique
package com.loveable;

import java.util.*;
public class Unique {
    public static double findUniq(double arr[]) {
        Map<Double, Integer> map = new HashMap<>();
        for (double num : arr) {
            Integer count = map.get(num);
            if(count == null){
                count = 0;
            }
            map.put(num, ++count);
        }
        System.out.println(map);
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return arr[0];
    }
}
