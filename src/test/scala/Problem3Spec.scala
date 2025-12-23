
package edu.z1.euler

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

/**
  * Largest prime factor
  *
  * The prime factors of 13195 are 5, 7, 13 and 29.
  *
  * What is the largest prime factor of the number 600851475143 ?
  */
class Problem3Spec() extends AnyFlatSpec with should.Matchers {

  "P3: prime factors of 5, 7, 13 and 29 " should " be equal 13195" in {
    assert(Problem3.largestPrimeFactor(600851475143L) == 13195)
  }

  "P3: prime factor of 600851475143L " should " be equal ???" in {
    assert(Problem3.largestPrimeFactor(600851475143L) == ???)
  }

}
