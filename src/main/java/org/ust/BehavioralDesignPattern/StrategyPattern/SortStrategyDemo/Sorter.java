package org.ust.BehavioralDesignPattern.StrategyPattern.SortStrategyDemo;

import java.util.Objects;

// Context
public class Sorter {

    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }

    public void sort(int []numbers){
        if(Objects.isNull(strategy)){
            System.out.println("No valid strategy defined");
            return;
        }
        strategy.sort(numbers);
    }
}
