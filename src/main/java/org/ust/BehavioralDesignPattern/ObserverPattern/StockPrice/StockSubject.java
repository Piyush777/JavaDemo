package org.ust.BehavioralDesignPattern.ObserverPattern.StockPrice;

public interface StockSubject {

    void registerObserver(StockObserver o);


    void removeObserver(StockObserver o);

    void notifyObserver();

}
