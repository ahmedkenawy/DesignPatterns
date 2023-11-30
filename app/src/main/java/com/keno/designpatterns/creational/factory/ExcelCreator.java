package com.keno.designpatterns.creational.factory;

public class ExcelCreator extends ReportCreator {
    @Override
    public Report createReport() {
        return new ExcelReport();
    }

    public void log(){
        System.out.println("change name");
    }
}
