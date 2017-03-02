package com.sjk.example

import spock.lang.Specification

class SubstringCheckTest extends Specification {

    def "Should return check that b is substring of a"() {
        given:
        SubstringCheck sb = new SubstringCheck();
        expect:
        sb.isSubstring(a,b) == out

        where:
        a|b||out
        [1,0,1,0,1,1,0,0,1,0] as byte[] | [1,0,1,1,0] as byte[] | 1 as byte
        [1,1,1,0,1,1,1,0,1,1] as byte[] | [1,0,0,1,1] as byte[] | 0 as byte
    }
}
