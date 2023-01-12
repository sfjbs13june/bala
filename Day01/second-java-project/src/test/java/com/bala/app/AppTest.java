package com.bala.app;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    @Test

    public void testSayWelcome(){
        String expectedResult= "Welcome from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.SayWelcome();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testSayHello(){
        String expectedResult= "Hello from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.SayHello();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testSayBye(){
        String expectedResult= "Bye from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.SayBye();
        Assert.assertEquals(expectedResult,result);
    }
}
