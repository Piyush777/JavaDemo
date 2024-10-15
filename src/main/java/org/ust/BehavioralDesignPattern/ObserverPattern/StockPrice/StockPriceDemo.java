package org.ust.BehavioralDesignPattern.ObserverPattern.StockPrice;

public class StockPriceDemo {

    public static void main(String[] args) {
        StockData stockData = new StockData();

        StockPriceDisplay zerodhaPriceDisplay = new StockPriceDisplay("Zerodha");
        StockPriceDisplay upstoxxPriceDisplay = new StockPriceDisplay("Upstoxx");

        stockData.registerObserver(zerodhaPriceDisplay);

        stockData.setStockData("TCS",4200);
        stockData.setStockData("TCS", 4300);

        stockData.registerObserver(upstoxxPriceDisplay);
        stockData.setStockData("ITC", 500);
        stockData.setStockData("ITC", 505);

        stockData.removeObserver(upstoxxPriceDisplay);
        stockData.removeObserver(zerodhaPriceDisplay);

        stockData.setStockData("HUL", 2700);
    }
}
