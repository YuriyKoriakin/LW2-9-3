package com.brainacad.oop.teststring3;

import java.util.Arrays;

/**
 * Created by Yuriy on 25.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueChars("Using methods of class String")));
    }

    public static char[] uniqueChars(String s) {
        char[] arrayS = s.toCharArray();
        StringBuilder tempString = new StringBuilder("");

        for (int i = 0; i < arrayS.length; i++) {
            int count = 0;
            for (int j = 0; j < arrayS.length; j++) {
                if (arrayS[i] == arrayS[j]) {
                    count++;
                }
            }
            if (count == 1) {
                tempString.append(arrayS[i]);
            }
        }
        return tempString.toString().toCharArray();
    }

}





