package com.udemy.app;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.udemy.app.LucasSequence;

public class FibonacciTest {

  LucasSequence app;

  @Before
  public void setUp() throws Exception {
    app = new LucasSequence();
  }

  @Test
  public void test() {
    Assert.assertEquals(3, app.fibonacci(4));
    Assert.assertEquals(89, app.fibonacci(11));
  }

}
