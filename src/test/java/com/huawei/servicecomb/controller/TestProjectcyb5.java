package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectcyb5 {

        Projectcyb5Delegate projectcyb5Delegate = new Projectcyb5Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectcyb5Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}