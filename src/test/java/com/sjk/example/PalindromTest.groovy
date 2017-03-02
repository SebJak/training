package com.sjk.example

import spock.lang.Specification

import static com.sjk.example.Palindrome.getLongestPalindrome

class PalindromTest extends Specification {

    def "Should return the longest palindrome from given string value"() {
        expect:
        getLongestPalindrome(value) == palindrome
        where:
        value | palindrome
        'ala' | 'ala'
        'alibaba' | 'bab'
        'test' | ''
    }
}
