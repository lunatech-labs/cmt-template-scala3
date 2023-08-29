package primes

object Primes {
  def sumOfPrimesBelow(limit: Int): BigInt =
    val primesBelow = EratosthenesSieve().primesUnder(limit)
    primesBelow.foldLeft(BigInt(0)) { case (sum, n) =>
      sum + n
    }
}
