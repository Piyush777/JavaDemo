package org.ust.BehavioralDesignPattern.StrategyPattern.SortStrategyDemo;

// Context
public class Sorter {

    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }

    public void sort(int []numbers){
        strategy.sort(numbers);
    }
}
