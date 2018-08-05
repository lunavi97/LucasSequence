package com.udemy.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PellLucasTests {

  LucasSequence app;

  @Before
  public void setUp() throws Exception {
    app = new LucasSequence();
  }

  @Test
  public void test() {
    Assert.assertEquals(6, app.pellLucas(2));
    Assert.assertEquals(198, app.pellLucas(6));
  }

}
