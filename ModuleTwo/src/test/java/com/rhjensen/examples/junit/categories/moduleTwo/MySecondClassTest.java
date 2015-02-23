package com.rhjensen.examples.junit.categories.moduleTwo;

import com.rhjensen.examples.junit.categories.moduleOne.Fast;
import com.rhjensen.examples.junit.categories.moduleOne.Slow;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class MySecondClassTest {
    MySecondClass secondObject = new MySecondClass();
    @Test
    public void shouldBeAbleToConvertStringToBoolean() {
        System.out.println("module-02:" + this.getClass().getSimpleName() + ":shouldBeAbleToConvertStringToBoolean");
        assertEquals(true, secondObject.valueOf("true"));
        assertEquals(false, secondObject.valueOf("false"));
    }

    @Test
    @Category(Fast.class)
    public void aMethodWithACategoryOfFast() {
        System.out.println("module-02:" + this.getClass().getSimpleName() + ":aMethodWithACategoryOfFast");
    }

    @Test
    @Category(Slow.class)
    public void aMethodWithACategoryOfSlow() {
        System.out.println("module-02" + this.getClass().getSimpleName() + ":aMethodWithACategoryOfSlow");
    }


}