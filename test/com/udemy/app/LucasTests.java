package com.udemy.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LucasTests {

  LucasSequence app;

  @Before
  public void setUp() throws Exception {
    app = new LucasSequence();
  }

  @Test
  public void test() {
    Assert.assertEquals(7, app.lucas(4));
    Assert.assertEquals(123, app.lucas(10));
  }

}
