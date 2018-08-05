package com.udemy.app;

public class LucasSequence {

  public LucasSequence() {}

  public int seqU(int argP, int argQ, int n) {
    throw new RuntimeException("Method unimplemented");
  }

  public int seqV(int argP, int argQ, int n) {
    throw new RuntimeException("Method unimplemented");
  }

  // Numbers

  /**
   * Fibonacci number.
   * @param n - Number
   * @return Fibonacci number
   */
  public int fibonacci(int n) {
    if (n <= 1) return n;

    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  /**
   * Lucas number.
   * @param n - Number
   * @return Lucas number
   */
  public int lucas(int n) {
    throw new RuntimeException("Method unimplemented");
  }

  /**
   * Pell number.
   * @param n - Number
   * @return Pell number
   */
  public int pell(int n) {
    throw new RuntimeException("Method unimplemented");
  }

  /**
   * Pell Lucas number.
   * @param n - Number
   * @return Pell Lucas number
   */
  public int pellLucas(int n) {
    throw new RuntimeException("Method unimplemented");
  }

  /**
   * Jacobsthal number.
   * @param n - Number
   * @return Jacobsthal number
   */
  public int jacobsthal(int n) {
    throw new RuntimeException("Method unimplemented");
  }

  /**
   * Jacobsthal-Lucas number.
   * @param n - Number
   * @return Jacobsthal-Lucas number
   */
  public int jacobsthalLucas(int n) {
    throw new RuntimeException("Method unimplemented");
  }

  /**
   * Mersenne number.
   * @param n - Number
   * @return Mersenne number
   */
  public int mersenne(int n) {
    throw new RuntimeException("Method unimplemented");
  }

  /**
   * Fermat number.
   * @param n - Number
   * @return Fermat number
   */
  public int fermat(int n) {
    throw new RuntimeException("Method unimplemented");
  }

  // Polynomials

  /**
   * Fibonacci polynomial evaluated at x.
   * @param n - Number
   * @param x - Number to evaluate
   * @return Fibonacci polynomial evaluated at x
   */
  public int fibonacciPoly(int n, int x) {
    throw new RuntimeException("Method unimplemented");
  }

  /**
   * Lucas polynomial.
   * @param n - Number
   * @param x - Number to evaluate
   * @return Lucas polynomial evaluated at x
   */
  public int lucasPoly(int n, int x) {
    throw new RuntimeException("Method unimplemented");
  }

  /**
   * Chebyshev of first kind.
   * @param n - Number
   * @param x - Number to evaluate
   * @return Chebyshev of first kind evaluated at x
   */
  public int chebyshevOfFirstKind(int n, int x) {
    throw new RuntimeException("Method unimplemented");
  }

  /**
   * Chebyshev of second kind.
   * @param n - Number
   * @param x - Number to evaluate
   * @return Chebyshev of second kind evaluated at x
   */
  public int chebyshevOfSecondKind(int n, int x) {
    throw new RuntimeException("Method unimplemented");
  } 

  /**
   * Repunit.
   * @param n - Number
   * @param b - Base
   * @return Repunit
   */
  public int repunit(int n, int b) {
    throw new RuntimeException("Method unimplemented");
  }

}