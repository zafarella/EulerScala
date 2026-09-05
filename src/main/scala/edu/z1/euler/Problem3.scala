
package edu.z1.euler

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

  def largestPrimeFactor(below: BigInt): BigInt = {
   
   // Tail-recursive helper function to find the largest prime factor
    @scala.annotation.tailrec
    def loop(currentNumber: Long, divisor: Long, largest: Long): Long = {
      if (currentNumber <= 1) {
        largest
      } else if (currentNumber % divisor == 0) {
        // 'divisor' is a factor, divide it out completely and update 'largest'
        loop(currentNumber / divisor, divisor, divisor)
      } else if (divisor * divisor > currentNumber) {
        // If the square of the divisor exceeds the remaining number, 
        // the remaining number itself must be prime and the largest factor.
        currentNumber
      } else {
        // Move to the next potential divisor
        // Optimization: skip even numbers after 2
        val nextDivisor = if (divisor == 2) 3 else divisor + 2
        loop(currentNumber, nextDivisor, largest)
      }
    }

    loop(below, 2, 1)
  }
}


}
