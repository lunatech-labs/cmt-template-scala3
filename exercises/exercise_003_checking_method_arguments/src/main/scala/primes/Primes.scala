package primes

object Primes {
  def sumOfPrimesBelow(limit: Int): BigInt =
    val primesBelow = EratosthenesSieve().primesUnder(limit)
    primesBelow.foldLeft(BigInt(0)) { case (sum, n) =>
      sum + n
    }

  def primeFactorsOf(n: Int): Vector[Int] =
    require(n >= 1, "Given number should be greater than 0")
    val allPrimes = EratosthenesSieve().primesUnder(math.min(n + 1, 3_000_002))

    def primeFactorsOfInternal(n: Int, primes: Seq[Int], primeFactors: Vector[Int]): Vector[Int] =
      val currentPrime = primes.head
      (n, n % currentPrime) match {
        case (1, _) => primeFactors
        case (_, 0) => primeFactorsOfInternal(n / currentPrime, primes, primeFactors :+ currentPrime)
        case _      => primeFactorsOfInternal(n, primes.tail, primeFactors)
      }

    if n == 1 then Vector(1) else primeFactorsOfInternal(n, allPrimes, Vector.empty[Int])
}
