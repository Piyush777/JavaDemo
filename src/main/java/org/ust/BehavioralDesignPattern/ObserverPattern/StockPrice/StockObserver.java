package org.ust.BehavioralDesignPattern.ObserverPattern.StockPrice;

public interface StockObserver {

    void update(String stockSymbol, double stockPrice);
}
