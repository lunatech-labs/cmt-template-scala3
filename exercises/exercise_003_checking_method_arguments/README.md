# Calculating prime factors for a given number

The [Fundamental theorem of Mathematics](https://en.wikipedia.org/wiki/Fundamental_theorem_of_arithmetic) states that

> Every integer greater than 1 can be represented uniquely as a product of prime numbers, up to the order of the factors.

To illustrate:

```
1 = 1
2 = 2
3 = 3
4 = (2 * 2)
5 = 5
6 = 2 * 3
7 = 7
8 = (2 * 2 * 2)
9 = (3 * 3)
10 = 2 * 5
...
```

Your task is to decompose an integer number greater than 1 (up to a maximum 
value of 3,000,001) into its prime factors

# Steps

- In object `Primes`, add a method `primeFactorsOf`
  with a single parameter `n` of type `Int`.
- Validate the argument passed to `primeFactorsOf`
- Implement the method to return a `Vector[Int]` that
  contains *all* prime factors of the given number
  in ascending order.

## Question

- Why did we ask the return type to be `Vector[Int]` and not `Seq[Int]`?

- Run `test` from the `sbt` prompt and check if all tests pass.
