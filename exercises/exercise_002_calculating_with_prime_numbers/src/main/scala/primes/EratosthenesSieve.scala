package primes

import collection.mutable.ArrayBuffer

/** A memory intensive, but very fast implementation of Eratosthenes' Sieve using a mutable collection
  *
  * Taken from: https://lombardo-chcg.github.io/code-challenge/2017/10/09/sieve-of-eratosthenes.html
  */

class EratosthenesSieve:
  def primesUnder(n: Int): List[Int] =
    // Input: an integer n > 1.
    if n <= 1 then List()
    else {
      // Let A be an array of Boolean values, indexed by integers 2 to n, initially all set to true.
      val numbers = ArrayBuffer.fill(n + 1)(true)
      // for i = 2, 3, 4, ..., not exceeding √n: if A[i] is true:
      for (i <- 2 to Math.sqrt(n).toInt if numbers(i)) {
        // for j = i2, i2+i, i2+2i, i2+3i, ..., not exceeding n:
        for (j <- (i * i) to n by i) {
          // A[j] := false.
          numbers.update(j, false)
        }
      }

      // Output: all i such that A[i] is true.
      (for (m <- numbers.indices if numbers(m)) yield m)
        .drop(2) // handling the 'off by 2' problem of the 0th index'ed array
        .takeWhile(_ < n)
        .toList
    }
