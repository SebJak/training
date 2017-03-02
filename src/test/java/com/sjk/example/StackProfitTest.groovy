package com.sjk.example

import spock.lang.Specification

import static com.sjk.example.StackProfit.getMaxProfit

class StackProfitTest extends Specification {

    def "Should return the max profit from stack prices"() {
        expect:
        getMaxProfit(stackPricesYesterday) == profit

        where:
        stackPricesYesterday | profit
        [10, 7, 5, 8, 11, 9]| 6
        [10, 7, 5, 8, 11, 4]| 6
        [12, 11, 10, 9, 8, 7]| -1
    }
}
