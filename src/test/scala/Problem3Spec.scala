

import edu.z1.euler.Problem3
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

/**
 * Largest prime factor
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
class Problem3Spec extends AnyFlatSpec with should.Matchers {

  val fixture: Problem3.type = Problem3

  "P3: prime factors of 13195" should "be equal to 5, 7, 13, 29" in {
    assert(fixture.largestPrimeFactor(13195) == List(5, 7, 13, 29))
    assert(fixture.largestPrimeFactor(13195).max == 29)
  }

  "P3: prime factor of 600851475143L " should " be equal to 5857" in {
    assert(fixture.largestPrimeFactor(600851475143L) == List(71, 839, 1471, 6857))
    assert(fixture.largestPrimeFactor(600851475143L).max == 6857)
  }

}
