package com.keno.designpatterns.creational.abstract_factory.factory;

import com.keno.designpatterns.creational.abstract_factory.button.Button;
import com.keno.designpatterns.creational.abstract_factory.checkbox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
