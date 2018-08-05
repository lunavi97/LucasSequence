package com.udemy.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ChebyshevTest.class, FibonacciPolyTest.class, LucasPolyTest.class })
public class PolynomialTests {

}
