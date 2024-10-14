package org.ust.BehavioralDesignPattern.StrategyPattern.SortStrategyDemo;

public class StrategyPatternDemo {
    public static void main(String[] args) {

        Sorter sorter = new Sorter();

        int []numbers= {5,2,1,9,3,6};

        //Use Bubble sort
        sorter.setStrategy(new BubbleSort());
        sorter.sort(numbers);

        //Use Quick Sort
        sorter.setStrategy(new QuickSort());
        sorter.sort(numbers);

        //Using null straegy
        sorter.setStrategy(null);
        sorter.sort(numbers);
    }
}
