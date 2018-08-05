package com.udemy.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RepunitTests {

  LucasSequence app;

  @Before
  public void setUp() throws Exception {
    app = new LucasSequence();
  }

  @Test
  public void test() {
    Assert.assertEquals(1093, app.repunit(7, 3));
    Assert.assertEquals(22621, app.repunit(5, 12));
  }

}
