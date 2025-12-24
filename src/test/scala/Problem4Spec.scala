
import edu.z1.euler.Problem4
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

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
class Problem4Spec extends AnyFlatSpec with should.Matchers {

  "P1: multiples of 3 and 5 below 10 " should " be equal 23" in {
    pending
    assert(Problem4.largestPalindromeProduct(10) == 23)
  }

  "P1: multiples of 3 and 5 below 1000 " should " be equal 233168" in {
    pending
    assert(Problem4.largestPalindromeProduct(1000) == 233168)
  }

}
