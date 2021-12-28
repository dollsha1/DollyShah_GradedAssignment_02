package com.greatlearning.service;

import com.greatlearning.sortandsearch.BinarySearch;
import com.greatlearning.sortandsearch.MergeSort;

public class StocksTrack {
    double[] sortedPrice;
    int StockRose = 0;
    int StockDeclined = 0;

   public StocksTrack(double[] stockPrices, boolean[] stockStatus) {
       MergeSort sort = new MergeSort();
       sort.sortArray(stockPrices);

       sortedPrice = stockPrices;

       for (boolean status : stockStatus) {
           if (status) {
               StockRose++;
           } else {
               StockDeclined++;
           }
       }
   }

   public void showStocks(boolean isAscOrder) {
       if (isAscOrder) {
           System.out.println("Stock prices in ascending order are :");
           for (double sortedStockPrice : sortedPrice) {
               System.out.print(sortedStockPrice + " ");
           }
       } else {
           System.out.println("Stock prices in descending order are :");
           for (int i = (sortedPrice.length - 1); i >= 0; i--) {
               System.out.print(sortedPrice[i] + " ");
           }
       }
       System.out.println("");
   }

   public void showNoOfCompaniesStockRose() {
       System.out.println("Total no of companies whose stock price rose today : " + StockRose);
   }

   public void showNoOfCompaniesStockDeclined() {
       System.out.println("Total no of companies whose stock price declined today : " + StockDeclined);
   }

   public void searchStockPrice(double searchValue) {
       BinarySearch bs = new BinarySearch();
       var valueIndex = bs.searchValue(sortedPrice, searchValue);

       if (valueIndex == -1) {
           System.out.println("Value not found");
       } else {
           System.out.println("Stock of value " + searchValue + " is present");
       }
   }
}