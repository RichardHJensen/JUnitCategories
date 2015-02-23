package com.rhjensen.examples.junit.categories.moduleOne;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class MyFirstClassIT {
    MyFirstClass firstObject = new MyFirstClass();
    @Test
    public void shouldBeAbleToConvertStringToBoolean() {
        System.out.println("module-01:" + this.getClass().getSimpleName() + ":shouldBeAbleToConvertStringToBoolean");
        assertEquals(true, firstObject.valueOf("true"));
        assertEquals(false, firstObject.valueOf("false"));
    }

    @Test
    @Category(Fast.class)
    public void aMethodWithACategoryOfFast() {
        System.out.println("module-01:" + this.getClass().getSimpleName() + ":aMethodWithACategoryOfFast");
    }

    @Test
    @Category(Slow.class)
    public void aMethodWithACategoryOfSlow() {
        System.out.println("module-01:" + this.getClass().getSimpleName() + ":aMethodWithACategoryOfSlow");
    }

}