
package edu.z1.euler

import scala.annotation.tailrec

/**
 *
 * Largest prime factor
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 * --------------------------------------
 *
 * @see https://en.wikipedia.org/wiki/Prime_factor
 *
 */

object Problem3 {

  def largestPrimeFactor(below: BigInt): List[BigInt] = {

    // Tail-recursive helper to collect factors into a list efficiently
    @tailrec
    def loop(currentNumber: BigInt, divisor: BigInt, acc: List[BigInt]): List[BigInt] = {
      if (currentNumber <= 1) {
        acc.reverse // Reverse to maintain ascending order
      } else if (currentNumber % divisor == 0) {
        // Found a factor, store it and keep dividing the number by it
        loop(currentNumber / divisor, divisor, divisor :: acc)
      } else if (divisor * divisor > currentNumber) {
        // If divisor squared exceeds the remaining number,
        // the remaining number itself must be a prime factor.
        (currentNumber :: acc).reverse
      } else {
        // Move to the next potential odd divisor
        val nextDivisor = if (divisor == 2) BigInt(3) else divisor + 2
        loop(currentNumber, nextDivisor, acc)
      }
    }

    if (below <= 1) Nil else loop(below, 2, Nil)
  }
}
