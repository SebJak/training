package com.sjk.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Variation {

    public static List<String> getAllVariations(String input) {
        List<String> values = new ArrayList<>();
        char[] inputChars = input.toCharArray();
        char[][] combinationArray = new char[inputChars.length][inputChars.length];
        for(int i=0;i<inputChars.length;i++) {
            combinationArray[i] = inputChars;
            values.add(new String(combinationArray[i]));
            inputChars = firstCharToEnd(inputChars);
        }
        StringBuilder tmp = new StringBuilder();
        for(int i=0;i<input.length();i++) {
            for(int j=0;j<input.length();j++) {
                tmp.append(combinationArray[j][i]);
            }
            values.add(tmp.toString());
            tmp.setLength(0);
        }
        return values;

    }

    public static List<String> getAllCircular(String input) {
        List<String> values = new ArrayList<>();
        char[] inputChars = input.toCharArray();
        for(int i=0;i<inputChars.length;i++) {
            values.add(new String(inputChars));
            inputChars = firstCharToEnd(inputChars);
        }
        return values;
    }

    static char[] firstCharToEnd(final char[] input) {
        char[] tmp = Arrays.copyOf(input, input.length-1);
        char[] result = new char[input.length];
        result[0] = input[input.length-1];
        System.arraycopy(tmp,0,result,1,tmp.length);
        return result;
    }

}
