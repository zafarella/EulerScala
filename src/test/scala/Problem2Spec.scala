
package edu.z1.euler

import org.scalatest._

class Problem2Spec() extends FlatSpec {

  "P1: multiples of 3 and 5 below 10 " should " be equal 23" in {
    assert(Problem1.multiplesOf3and5(10) == 23)
  }

  "P1: multiples of 3 and 5 below 1000 " should " be equal 233168" in {
    assert(Problem1.multiplesOf3and5(1000) == 233168)
  }

}
