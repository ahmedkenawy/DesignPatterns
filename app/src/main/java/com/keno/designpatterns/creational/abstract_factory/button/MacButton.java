package com.keno.designpatterns.creational.abstract_factory.button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac Button Clicked!!");
    }
}