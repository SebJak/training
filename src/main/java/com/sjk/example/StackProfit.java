package com.sjk.example;

import java.util.IntSummaryStatistics;
import java.util.List;

public class StackProfit {
    /*
     Suppose we could access yesterday's stock prices as a list, where:

    The values are the price in dollars of Apple stock.
    A higher index indicates a later time.

    So if the stock cost $500 at 10:30am and $550 at 11:00am, then:
    stock_prices_yesterday[60] = 500

    Write an efficient function that takes stock_prices_yesterday and returns the best profit
    I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.
    For example:

    stock_prices_yesterday = [10, 7, 5, 8, 11, 9]
    get_max_profit(stock_prices_yesterday)
    # returns 6 (buying for $5 and selling for $11)
     */


    public static int getMaxProfit(final List<Integer> stockPrices) {
        int profit=Integer.MIN_VALUE;
        for(int index=0; index < stockPrices.size()-1; index++ ) {
            for(int i=index+1; i<stockPrices.size();i++) {
                int tmp = stockPrices.get(i) - stockPrices.get(index);
                if( tmp > profit) {
                    profit = tmp;
                }
            }
        }
        return profit;
    }
}
