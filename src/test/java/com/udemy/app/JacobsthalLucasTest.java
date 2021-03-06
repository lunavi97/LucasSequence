package com.udemy.app;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.udemy.app.LucasSequence;

public class JacobsthalLucasTest {

  LucasSequence app;

  @Before
  public void setUp() throws Exception {
    app = new LucasSequence();
  }

  @Test
  public void test() {
    Assert.assertEquals(31, app.jacobsthalLucas(5));
    Assert.assertEquals(2047, app.jacobsthalLucas(11));
  }

}
