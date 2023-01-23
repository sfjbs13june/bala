package com.bala.app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Greeting greeting = new Greeting();
        String result= greeting.SayHi();
        System.out.println(result);
        double divResult=0l;
        try {
            //    divResult = greeting.getDiv(1, 0);
            divResult=greeting.getThrowException(4,0);
        }catch (Exception ex){
            System.out.println("The exception is :"+ex);
        }
        System.out.println(divResult);
    }
}
