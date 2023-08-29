# Calculating the sum of a series of consecutive prime numbers

Your task is to calculate the sum of all the prime numbers
smaller than 3,000,000

You can write your own Prime number generator, but you can also
use one that is provided by executing the following `cmtc` command
on the command line:

`cmtc pull-template src/main/scala/primes/EratosthenesSieve.scala`

Have a look at the provided class and look at
how you can use it to calculate a series of prime
numbers starting from 2 upto a given number.

# Steps

- Create a new object `SumOfPrimes`
- Define a method `sumOfPrimesBelow` with a single parameter
 `limit` of type `Int`.
- Implement the method to return the sum of all primes numbers
  below `limit`.
- What should the return type of `sumOfPrimesBelow` be?

- Run `test` from the `sbt` prompt and check if all tests pass.