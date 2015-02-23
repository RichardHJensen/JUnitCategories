package com.rhjensen.examples.junit.categories.moduleOne;

import com.rhjensen.junit.categories.Fast;
import com.rhjensen.junit.categories.MustRun;
import com.rhjensen.junit.categories.Slow;
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

    @Test
    @Category(MustRun.class)
    public void aMethodWithACategoryOfMustRun() {
        System.out.println("module-01:" + this.getClass().getSimpleName() + ":aMethodWithACategoryOfMustRun");
    }

    @Test
    @Category({Slow.class, MustRun.class})
    public void aMethodWithCategoriesSlowAndMustRun() {
        System.out.println("module-01:" + this.getClass().getSimpleName() + ":aMethodWithCategoriesSlowAndMustRun");
    }

    @Test
    @Category({Fast.class, MustRun.class})
    public void aMethodWithCategoriesFastAndMustRun() {
        System.out.println("module-01:" + this.getClass().getSimpleName() + ":aMethodWithCategoriesFastAndMustRun");
    }
}