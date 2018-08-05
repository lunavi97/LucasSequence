package com.udemy.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ChebyshevTests.class, FibonacciPolyTests.class, LucasPolyTests.class })
public class PolynomialTests {

}
