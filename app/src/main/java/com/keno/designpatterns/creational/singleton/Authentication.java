package com.keno.designpatterns.creational.singleton;

public class Authentication {
    private Authentication authentication;

    private Authentication() {
        //private constructor to prevent Instiation
    }

    public Authentication getInstance() {
        if (authentication != null)
            return authentication;
        return new Authentication();
    }
}
