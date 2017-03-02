package com.sjk.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Palindrome {

    public static String getLongestPalindrome(final String value){
        List<String> palindromes = new ArrayList<>();
        for(int i=0;i<value.length()-1;i++) {
            char charAt = value.charAt(i);
            List<Integer> indexes = getIndexesOfChar(charAt, value.toCharArray());
            for(Integer index: indexes) {
                if(index > i) {
                    String tmp = value.substring(i, index + 1);
                    if (tmp.equals(new StringBuilder(tmp).reverse().toString())) {
                        palindromes.add(tmp);
                    }
                }
            }
        }
        Optional<String> palindrome = palindromes.stream().max((s1, s2) -> s1.length() - s2.length());
        return palindrome.isPresent() ? palindrome.get() : "";
    }

    private static List<Integer> getIndexesOfChar(char c, char[] value) {
        List<Integer> indexes = new ArrayList<>();
        for(int i=0;i<value.length;i++) {
            if(value[i] == c) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
