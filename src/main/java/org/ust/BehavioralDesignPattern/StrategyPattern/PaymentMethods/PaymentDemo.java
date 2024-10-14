package org.ust.BehavioralDesignPattern.StrategyPattern.PaymentMethods;

public class PaymentDemo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        //Payment using PayPal
        shoppingCart.setPaymentStrategy(new PayPalPayment("user@gmail.com"));
        shoppingCart.checkout(300);

        //Payment using Credit Card
        shoppingCart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        shoppingCart.checkout(200);

        //Another Credit Card Payment
        shoppingCart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-4122"));
        shoppingCart.checkout(210);

    }
}
