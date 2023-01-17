package com.bala.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class HelloControllerTest {
    HelloController helloController=new HelloController();
    @Test
    public void testrequestWelcome1(){
        String name="world";
        String expectedResult= "Welcome to"+name;
        String result= helloController.welcome1(name);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testrequestSendMessage(){
        String message="world";
        String expectedResult= "send message "+message;
        String result= helloController.sendMessage(message);
        Assert.assertEquals(expectedResult,result);
    }

}
