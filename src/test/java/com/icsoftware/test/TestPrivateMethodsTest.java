package com.icsoftware.test;


import org.junit.Before;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
public class TestPrivateMethodsTest {

     private TestPrivateMethods testPrivateMethods = new TestPrivateMethods();
//
//     @Before
//     public void setup(){
//          testPrivateMethods =  new TestPrivateMethods();
//     }

     @Test
     public void getAddNumberDoubleTest() throws Exception{
          int actual = Whitebox.invokeMethod(testPrivateMethods,
                  "getAddNumberDouble", 5);

          assertThat(actual, is(10));

     }

    @Test
    public void getTime2Test() throws Exception{
        int actual = Whitebox.invokeMethod(testPrivateMethods,
                "getTime2", 5);

        assertThat(actual, is(25));

    }

    @Test
    public void getDivTest() throws Exception{
        int actual = Whitebox.invokeMethod(testPrivateMethods,
                "getDiv", 5);

        assertThat(actual, is(5));

    }
}
