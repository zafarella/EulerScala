
package edu.z1.euler

/**
  * Even Fibonacci numbers
  *
  * Each new term in the Fibonacci sequence is generated by
  * adding the previous two terms. By starting with 1 and 2,
  * the first 10 terms will be:
  * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
  *
  * By considering the terms in the Fibonacci sequence whose
  * values do not exceed four million, find the sum of the even-valued terms.
  */

object Problem2 {

  def evenFibonacciNums(below: Int): BigInt = {
    if (below < 0) {
      0
    }
    else {
      Stream.range(1, below).filter(fib(_) % 2 == 0).sum
    }
  }

  private def fib(n: Int): Int = {
    if (n == 0 || n == 1) {
      n
    }
    else {
      fib(n - 1) + fib(n - 2)
    }
  }
}
