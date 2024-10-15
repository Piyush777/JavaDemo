package org.ust.BehavioralDesignPattern.ObserverPattern.StockPrice;

public class StockPriceDisplay implements StockObserver{
    private String stockSymbol;
    private double stockPrice;
    private String name;

    public StockPriceDisplay(String name){
        this.name=name;
    }


    @Override
    public void update(String stockSymbol, double stockPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;

        display();
    }

    private void display(){
        System.out.println("Display "+ this.name+" Stock: "+ stockSymbol+" Price:"+ stockPrice);
    }

}
