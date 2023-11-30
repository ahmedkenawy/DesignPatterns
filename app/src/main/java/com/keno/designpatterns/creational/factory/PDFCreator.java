package com.keno.designpatterns.creational.factory;

public class PDFCreator extends ReportCreator {
    @Override
    public Report createReport() {
        return new PDFReport();
    }

    public void log(){
        System.out.println("change name");
    }
}
