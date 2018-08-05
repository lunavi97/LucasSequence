package com.udemy.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ NumberTests.class, PolynomialTests.class, RepunitTests.class })
public class AllTests {

}
