package com.sjk.example

import spock.lang.Specification

class RegexChecker extends Specification{

    def "Should match the string"() {
        expect:
        ("{Name}" =~ /[\{|\}]/.find()) == true

        ("Name" =~ /[^\{|\}]/.find()) == true

    }
}
