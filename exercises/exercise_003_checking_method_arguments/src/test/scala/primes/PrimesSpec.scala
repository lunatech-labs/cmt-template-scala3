package primes

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PrimesSpec extends AnyFlatSpec with Matchers {
  it should "calculate the correct sum of all primes smaller than 3,000,000" in {
    val expectedSum = BigInt("312471072265")
    val calculatedSum = Primes.sumOfPrimesBelow(3_000_000)
    calculatedSum shouldBe expectedSum
  }

  it should "calculate the correct sum of all primes smaller than 11" in {
    val expectedSum = BigInt("17")
    val calculatedSum = Primes.sumOfPrimesBelow(11)
    calculatedSum shouldBe expectedSum
  }

}
