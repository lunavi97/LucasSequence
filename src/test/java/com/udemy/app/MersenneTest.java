package com.udemy.app;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.udemy.app.LucasSequence;

public class MersenneTest {

  LucasSequence app;

  @Before
  public void setUp() throws Exception {
    app = new LucasSequence();
  }

  @Test
  public void test() {
    Assert.assertEquals(31, app.mersenne(5));
    Assert.assertEquals(4095, app.mersenne(12));
  }

}
