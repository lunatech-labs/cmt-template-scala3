package primes

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PrimeFactorSpec extends AnyFlatSpec with Matchers {
  it should "split a given number into its prime factors" in {
    Primes.primeFactorsOf(1) shouldBe Vector(1)
    Primes.primeFactorsOf(2) shouldBe Vector(2)
    Primes.primeFactorsOf(3) shouldBe Vector(3)
    Primes.primeFactorsOf(4) shouldBe Vector(2, 2)
    Primes.primeFactorsOf(5) shouldBe Vector(5)
    Primes.primeFactorsOf(6) shouldBe Vector(2, 3)
    Primes.primeFactorsOf(7) shouldBe Vector(7)
    Primes.primeFactorsOf(8) shouldBe Vector(2, 2, 2)
    Primes.primeFactorsOf(9) shouldBe Vector(3, 3)
    Primes.primeFactorsOf(10) shouldBe Vector(2, 5)
    Primes.primeFactorsOf(3_000_001) shouldBe Vector(853, 3517)
  }

  it should "throw an exception for number less than 1" in {
    an[IllegalArgumentException] should be thrownBy Primes.primeFactorsOf(-1)
    an[IllegalArgumentException] should be thrownBy Primes.primeFactorsOf(0)
  }

}
