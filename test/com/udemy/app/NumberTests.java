package com.udemy.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
  FermatTests.class, FibonacciTests.class, JacobsthalLucasTests.class, JacobsthalTests.class,
  LucasTests.class, MersenneTests.class, PellLucasTests.class, PellTests.class
})
public class NumberTests {

}
