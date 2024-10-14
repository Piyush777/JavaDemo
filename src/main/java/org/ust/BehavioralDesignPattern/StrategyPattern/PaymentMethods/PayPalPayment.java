package org.ust.BehavioralDesignPattern.StrategyPattern.PaymentMethods;

//Concrete Strategy B: PayPal Payment
public class PayPalPayment implements PaymentStrategy{

    private String email;

    public PayPalPayment(String email){
        this.email=email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+ amount+" using PayPal account "+ email);
    }
}
