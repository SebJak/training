package com.sjk.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 Given two binary strings, A (of length 10) and B (of length 5), output 1 if B is a substring of A and 0 otherwise.

Please note, that the solution may only be submitted in the following languages: Brainf**k, Whitespace and Intercal.
Input

24 lines consisting of pairs of binary strings A and B separated by a single space.
Output

The logical value of: 'B is a substring of A'.
Example

First two lines of input:

1010110010 10110
1110111011 10011

First two lines of output:
1
0
 */
public class SubstringCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Byte> out = new LinkedList<>();
        while(sc.hasNext()) {
            String in = sc.nextLine();
            String[] input = in.split(" ");
            out.add(isSubstring(input[0].getBytes(), input[1].getBytes()));
        }
        out.forEach(System.out::print);
    }

    public static byte isSubstring(byte[] a, byte[] b) {
        int aLength = a.length;
        int bLength = b.length;
        int substring = 0;
        if (aLength < bLength) {
            return 0;
        }
        for(int i=0; i<aLength-bLength;i++) {
            for(int j=0;j<bLength;j++) {
                if(a[i+j] == b[j]) {
                    substring++;
                }
            }
            if(substring == bLength) {
                return 1;
            }
            else {
                substring = 0;
            }
        }
        return 0;

    }
}
