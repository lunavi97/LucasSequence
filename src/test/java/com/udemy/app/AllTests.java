package com.udemy.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ NumberTests.class, PolynomialTests.class, RepunitTest.class })
public class AllTests {

}
