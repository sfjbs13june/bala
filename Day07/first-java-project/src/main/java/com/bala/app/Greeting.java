package com.bala.app;

public class Greeting {

    public String SayHi(){
        return "Hi from greeting";
    }

    public double getDiv(int a,int b){
        return a/b;
    }

    public double getThrowException(int a,int b) throws MyDataException {
        if(b==0){
            throw new MyDataException("b should not be null");
        }
        return a/b;
    }
}
