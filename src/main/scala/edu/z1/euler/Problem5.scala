package edu.z1.euler

import scala.annotation.tailrec

/**
 * 2520 is the smallest number that can be divided by each
 * of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is divisible
 * with no remainder by all of the numbers from 1 to 20
 */

object Problem5 {

  def smallestMultiple(maxRange: Int): Long = {
    // Helper function to find the Greatest Common
    // Divisor (GCD) using Euclidean Algorithm
    @tailrec
    def gcd(a: Long, b: Long): Long = {
      if (b == 0) a else gcd(b, a % b)
    }

    // Helper function to find the Least
    // Common Multiple (LCM) of two numbers
    def lcm(a: Long, b: Long): Long = {
      (a * b) / gcd(a, b)
    }

    (1L to maxRange.toLong)
      .reduceLeft(
        (currentLcm, nextNumber) => lcm(currentLcm, nextNumber)
      )
  }
}
