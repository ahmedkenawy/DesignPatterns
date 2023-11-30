package com.keno.designpatterns.creational.abstract_factory.button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows Button Clicked!!");
    }
}
