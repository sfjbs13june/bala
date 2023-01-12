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
        String result1= greeting.SayHello();
        String result2= greeting.SayBye();
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
