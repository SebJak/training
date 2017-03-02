package com.sjk.example;

import java.util.List;
import java.util.stream.LongStream;

import static com.sjk.example.Variation.getAllCircular;

public class EulerNumber {

    public static boolean isEulerNumber(long number) {
        List<String> variations = getAllCircular(String.valueOf(number));
        return !variations.stream().filter(s -> isNotPrimeNumber(Long.valueOf(s))).findFirst().isPresent();
    }

    static boolean isNotPrimeNumber(long number) {
        if(number == 0 || number==1)
            return true;
        return LongStream.range(2, number).filter(e -> number % e == 0).findAny().isPresent();
    }
}
