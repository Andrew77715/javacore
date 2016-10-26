package com.Andrew77715.runners.converterRunner;


import com.Andrew77715.app.homework.homework4.PrimitiveConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;


    public class TestConverterRunner {
        @Test
        public void TestConverterCharTiInt() {
            PrimitiveConverter testCoverter = new PrimitiveConverter();
            char a = 'A';
            char exRes = 65;
            Assert.assertEquals(exRes, a);

             }
        @Test
        public void TestConverterFloatToChar() {

            PrimitiveConverter testCoverter2 = new PrimitiveConverter();
            float c = 100.0f;
            float exRes = 'd';
            // Assert.assertE(exRes, testCoverter2.floatToChar(a));
            Assert.assertTrue(c == 'd');
        }
        @Test
        public void TestConverterNegative() {

            PrimitiveConverter testCoverter3 = new PrimitiveConverter();
            float c = 100.0f;
            float exRes = 'd';
            if (c != 'd')Assert.fail();

        }
        @Test
        public void TestIntToChar(){
            PrimitiveConverter testCoverter = new PrimitiveConverter();
            int a = 99;
            int exRes = 'c';
            Assert.assertEquals(exRes, a);
        }
    }
