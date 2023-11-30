package com.keno.designpatterns.creational.factory;

public class ExcelReport implements Report {

    @Override
    public void generateReport() {
        System.out.println("excel report generated successfully");
    }
}
