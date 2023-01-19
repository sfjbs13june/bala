package com.bala.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalOperationTest
{
    CalOperation co = new CalOperation();
    @Test
    public void CalOperationAdd()
    {
        long a = (long)5.0;
        long b = (long)4.0;
        long expected = 9 ;
        long res = co.add(a,b);
        Assertions.assertEquals(expected,res);
    }

    @Test
    public void CalOperationSub()
    {
        long a = (long)12.0;
        long b = (long)5.0;
        long expected = 7;
        long res = co.sub(a,b);
        Assertions.assertEquals(expected,res);
    }

    @Test
    public void CalOperationMul()
    {
        long a = (long) 15.0;
        long b = (long) 9.0;
        long expected = 135;
        long res = co.mul(a,b);
        Assertions.assertEquals(expected,res);
    }

    @Test
    public void CalOperationDiv()
    {
        long a = (long)9.0;
        long b = (long)3.0;
        long expected = 3;
        long res = co.div(a,b);
        Assertions.assertEquals(expected,res);
    }
}
