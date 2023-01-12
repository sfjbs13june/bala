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
        String result= greeting.SayWelcome();
        String result= greeting.SayHello();
        String result= greeting.SayBye();
        System.out.println(result);
    }
}
