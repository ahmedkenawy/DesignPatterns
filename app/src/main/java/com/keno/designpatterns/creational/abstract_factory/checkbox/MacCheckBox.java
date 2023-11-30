package com.keno.designpatterns.creational.abstract_factory.checkbox;

public class MacCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Mac CheckBox Clicked!!");
    }
}
