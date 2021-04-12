////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Luke Allevato
//CSC160178 Computer Science I
//Homework 9.2
//3/25/2021
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package edu.arapahoe.CSC160;
/*
public class StockClass {

    public static void main(String[] args) {

        Code for testing
        Stock ORCLStock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        Stock YAHOOStock = new Stock("YAHOO", "Yahoo", 34.5, 34.35);
        System.out.println("The percent change is " + ORCLStock.getChangePercent() + "%");

    }*/

    //Class for creating Stock objects

    public class Stock {

        private String symbol = "Unknown";       //Initiates properties
        private String name = "Unknown";
        private double previousClosingPrice = 0;
        private double currentPrice = 0;

        public Stock(String symbol,        //Constructors assign parameters to Stock object properties
              String name,
              double previousClosingPrice,
              double currentPrice)
        {
            this.symbol = symbol;
            this.name = name;
            this.previousClosingPrice = previousClosingPrice;
            this.currentPrice = currentPrice;
        }

        //getChangePercent() method prints change between previousClosingPrice and currentPrice as percentage

        public double getChangePercent(){
            return (currentPrice / previousClosingPrice * 100);
        }
    }
