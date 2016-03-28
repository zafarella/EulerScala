
package edu.z1.euler

/**
  * If we list all the natural numbers below 10 that
  * are multiples of 3 or 5, we get 3, 5, 6 and 9.
  * The sum of these multiples is 23.
  *
  * Find the sum of all the multiples of 3 or 5 below 1000.
  * References:
  * -- http://www.scala-lang.org/docu/files/collections-api/collections_42.html
  * -- http://docs.scala-lang.org/overviews/collections/views.html
  */

object Problem1 {

  def multiplesOf3and5(below: Int): Int = {
    if (below < 0) {
      0
    } else {
      (1 until below).view.filter(n => n % 3 == 0 || n % 5 == 0).sum
    }
  }

}
