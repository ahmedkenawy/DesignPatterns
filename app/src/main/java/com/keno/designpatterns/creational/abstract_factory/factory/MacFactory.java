package com.keno.designpatterns.creational.abstract_factory.factory;

import com.keno.designpatterns.creational.abstract_factory.button.Button;
import com.keno.designpatterns.creational.abstract_factory.button.MacButton;
import com.keno.designpatterns.creational.abstract_factory.checkbox.CheckBox;
import com.keno.designpatterns.creational.abstract_factory.checkbox.MacCheckBox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
