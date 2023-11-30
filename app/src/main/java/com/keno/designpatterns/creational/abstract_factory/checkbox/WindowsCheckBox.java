package com.keno.designpatterns.creational.abstract_factory.checkbox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Windows CheckBox Clicked!!");
    }
}
