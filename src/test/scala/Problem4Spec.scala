
import edu.z1.euler.Problem4
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

/**
 * Largest palindrome product
 *
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of
 * two 2-digit numbers is 9009 = 91 × 99.
 *
 *
 * Find the largest palindrome made from
 * the product of two 3-digit numbers.
 *
 */

class Problem4Spec extends AnyFlatSpec with should.Matchers {

  val fixture: Problem4.type = Problem4

  "P4: largest palindrome product of two 2-digit numbers" should "be equal to 9009" in {
    assert(fixture.largestPalindromeProduct(2) == 9009)
  }

  "P4: largest palindrome product of two 3-digit numbers" should "be equal to 906609" in {
    assert(fixture.largestPalindromeProduct(3) == 906609)
  }

  "P4: largest palindrome product of two 4-digit numbers" should "be equal to 99000099" in {
    assert(fixture.largestPalindromeProduct(4) == 99000099)
  }
}
