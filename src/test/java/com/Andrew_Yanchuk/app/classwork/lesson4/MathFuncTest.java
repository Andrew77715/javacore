package com.Andrew_Yanchuk.app.classwork.lesson4;

import classwork.lesson4.MathFunc;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sony on 12.10.2016.
 */
public class MathFuncTest {
    @Test // JUnit framework annotation
    public void multiplyTest(){
        int a = 1, b = 2, expRes = 2;
        MathFunc myMathFunc = new MathFunc();
        myMathFunc.mutiply(a, b);
        Assert.assertEquals(expRes, myMathFunc.mutiply(a, b));
    }
}
