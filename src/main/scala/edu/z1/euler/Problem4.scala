
package edu.z1.euler

/**
 * Largest palindrome product
 *
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product
 * of two 2-digit numbers is 9009 = 91 × 99.
 *
 *
 * Find the largest palindrome made from
 * the product of two 3-digit numbers.
 *
 */

object Problem4 {

  def largestPalindromeProduct(digits: Int): Int = {
    // Calculate the numeric bounds based on the digit count
    val maxVal = math.pow(10, digits).toInt - 1
    val minVal = math.pow(10, digits - 1).toInt

    // Helper method to check if a number is a palindrome
    def isPalindrome(n: Int): Boolean = {
      val s = n.toString
      s == s.reverse
    }

    // Create a lazy collection of products
    // of two numbers within our bounds
    val products: LazyList[Int] = for {
      i <- LazyList.range(maxVal, minVal - 1, -1)
      // j starts at i to avoid duplicate pairs
      j <- LazyList.range(i, minVal - 1, -1)
    } yield i * j

    // Filter for palindromes and
    // instantly pull out the maximum value
    products.filter(isPalindrome).max
  }

}
