package com.rhjensen.examples.junit.categories.moduleOne;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyFirstClassTest {
    MyFirstClass firstObject = new MyFirstClass();
    @Test
    public void shouldBeAbleToConvertStringToBoolean() {
        assertEquals(true, firstObject.valueOf("true"));
        assertEquals(false, firstObject.valueOf("false"));
    }

}