package com.sjk.example

import spock.lang.Specification

import static com.sjk.example.EulerNumber.isEulerNumber
import static com.sjk.example.EulerNumber.isNotPrimeNumber

class EulerNumberTest extends Specification {

    def "Should check that number is Euler Number"() {

        expect:
        result == isEulerNumber(number)
        where:
        number   || result
        2l       || true
        3l       || true
        11l      || true
        13l      || true
        17l      || true
        197l     || true
        1193l    || true
        425l    || false
        512l    || false
    }

    def "Should check that number is prime"() {
        expect:
        isNotPrimeNumber(number) == isNotPrime
        where:
        number||isNotPrime
        2||false
        5||false
        97||false
        66||true
        1 || true
    }
}
