package org.ust.BehavioralDesignPattern.ObserverPattern.StockPrice;

import java.util.ArrayList;
import java.util.List;

//Concrete Subject
public class StockData implements StockSubject{

    private List<StockObserver> observerList;

    private String stockSymbol;

    private double stockPrice;

    public StockData(){
        observerList = new ArrayList<>();

    }


    @Override
    public void registerObserver(StockObserver o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(StockObserver o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(StockObserver stockObserver: observerList){
            stockObserver.update(stockSymbol, stockPrice);
        }
    }

    public void setStockData(String stockSymbol, double stockPrice){
        this.stockSymbol=stockSymbol;
        this.stockPrice = stockPrice;
        notifyObserver();
    }
}
