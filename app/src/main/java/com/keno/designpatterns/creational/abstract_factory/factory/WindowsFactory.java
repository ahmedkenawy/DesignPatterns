package com.keno.designpatterns.creational.abstract_factory.factory;

import com.keno.designpatterns.creational.abstract_factory.button.Button;
import com.keno.designpatterns.creational.abstract_factory.button.WindowsButton;
import com.keno.designpatterns.creational.abstract_factory.checkbox.CheckBox;
import com.keno.designpatterns.creational.abstract_factory.checkbox.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
