package com.patterns.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Beverage latte = new Milk(new Milk(new Espresso()));
        String latteCoast = String.format("%.2f", latte.getCost());
        System.out.println("Beverage name: " + latte.getName() + " coast: " + latteCoast);

        Beverage soyMochadarkRoast = new Soy(new Mocha(new DarkRoast()));
        String smrCoast = String.format("%.2f", soyMochadarkRoast.getCost());
        System.out.println("Beverage name: " + soyMochadarkRoast.getName() + " coast: " + smrCoast);
    }
}
