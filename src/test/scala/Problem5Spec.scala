
import edu.z1.euler.Problem5
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

/**
 * 2520 is the smallest number that can be divided by each
 * of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is divisible
 * with no remainder by all of the numbers from 1 to 20
 */

class Problem5Spec extends AnyFlatSpec with should.Matchers {

  val fixture: Problem5.type = Problem5

  "P5: smallest multiple for numbers 1 to 10" should "be equal to 2520" in {
    assert(fixture.smallestMultiple(10) == 2520)
  }

  "P5: smallest multiple for numbers 1 to 20" should "be equal to 232792560" in {
    assert(fixture.smallestMultiple(20) == 232792560)
  }
}
