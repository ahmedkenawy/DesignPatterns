package com.keno.designpatterns.creational.prototype;

import android.widget.Toast;

import java.util.Objects;

class ConcretePrototype implements CloneablePrototype{

    private String testData;
    private String name;
    private String test;

    public ConcretePrototype(String testData) {
        this.testData = testData;
    }

    public String getData() {
        return testData;
    }



    public void setData(String testData) {
        this.testData = testData;
    }

    @Override
    public CloneablePrototype clone() {
        return new ConcretePrototype(testData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testData);
    }


    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "testData='" + testData + '\'' +
                '}';
    }

}

