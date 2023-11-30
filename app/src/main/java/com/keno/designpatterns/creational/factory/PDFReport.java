package com.keno.designpatterns.creational.factory;

public class PDFReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("pdf file generated successfully");
    }
}
