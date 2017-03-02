package com.sjk.example

import spock.lang.Specification

class VariationTest extends Specification {

    def "Should return all variations" () {
        given:
        List<String> variations = Variation.getAllVariations("197")
        List<String> expected = ["197","917", "971", "719", "791", "179"]
        expect:
        variations.sort() == expected.sort()
    }

    def "Should shift array by one"() {
        given:
        char[] input = ['1', '2' ,'3']
        expect:
        Variation.firstCharToEnd(input) == ['3', '1', '2'] as char[]

    }

    def "Should return circular numbers"() {
        given:
        List<String> variations = Variation.getAllCircular("197")
        List<String> expected = ["197","971", "719"]
        expect:
        variations.sort() == expected.sort()
    }
}
