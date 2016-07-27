
import edu.z1.euler.Problem4
import org.scalatest._

/**
  * Largest palindrome product
  *
  * A palindromic number reads the same both ways. The largest palindrome made
  * from the product of two 2-digit numbers is 9009 = 91 × 99.
  *
  *
  * Find the largest palindrome made from the product of two 3-digit numbers.
  *
  */
class Problem4Spec() extends FlatSpec {

  "P4: largest palindrome made from the product of two 2-digit numbers " should " be equal 9009" in {
    assert(Problem4.largestPalindromeProduct(2) == 9009)
  }

  "P4: largest palindrome made from the product of two 3-digit numbers " should " be equal 233168" in {
    assert(Problem4.largestPalindromeProduct(2) == 233168)
  }

}
