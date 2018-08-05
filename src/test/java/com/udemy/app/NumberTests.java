package com.udemy.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FermatTest.class, FibonacciTest.class, JacobsthalLucasTest.class, JacobsthalTest.class, LucasTest.class,
    MersenneTest.class, PellLucasTest.class, PellTest.class })
public class NumberTests {

}
