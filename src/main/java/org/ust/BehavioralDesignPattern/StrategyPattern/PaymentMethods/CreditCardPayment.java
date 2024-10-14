package org.ust.BehavioralDesignPattern.StrategyPattern.PaymentMethods;

//Concrete Strategy A: Credit Card Payment
public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;

    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+ amount+" using Credit Card "+ this.cardNumber);
    }
}
