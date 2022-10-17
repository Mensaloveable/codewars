package com.loveable;

//    Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings.
//    All words must have their first letter capitalized without spaces.
//
//For instance:
//
//camelCase("hello case"); // => "HelloCase"
//camelCase("camel case word"); // => "CamelCaseWord"
//Don't forget to rate this kata! Thanks :)

import java.util.*;
public class CamelCase {

    public static String camelCase(String str) {
        // your code here
        String[] strSplit = str.split(" ");
        System.out.println(str + "\t" + Arrays.toString(strSplit));
        for(int i = 0; i < strSplit.length; ++i) {
            if(strSplit[i].length() > 0){
                strSplit[i] = strSplit[i].substring(0, 1).toUpperCase() + strSplit[i].substring(1);
            }
        }
        return String.join("", strSplit);
    }
}
