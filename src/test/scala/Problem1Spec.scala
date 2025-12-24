

import edu.z1.euler.Problem1
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should


class Problem1Spec() extends AnyFlatSpec with should.Matchers {

  "P1: multiples of 3 and 5 below 10 " should " be equal 23" in {
    assert(Problem1.multiplesOf3and5(10) == 23)
  }

  "P1: multiples of 3 and 5 below 1000 " should " be equal 233168" in {
    assert(Problem1.multiplesOf3and5(1000) == 233168)
  }

}
