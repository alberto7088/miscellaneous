package expressions

import scala.annotation.tailrec

object expressions extends App {

  def factorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // this is the last thing to be evaluate so no stack

    factHelper(n, 1)
  }
  /*
  factorial(10) = factHelper(10, 1)
  = factHelper(9, 10 * 1)
  = factHelper(8, 9 * 10 * 1)
  = factHelper(7, 8 * 9 * 10 * 1)
  = ....
  = factHelper(2, 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
  = factHelper(1, 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)

  return  2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1
  */
  //println(factorial(20000))

  //Calculating fibonacci using tail recursion
  def tailFib(n: Int): BigInt = {
    def fibHelper(x: Int, last: BigInt, prevToLast: BigInt): BigInt =
      if (x >= n) last
      else fibHelper(x+1, last + prevToLast, last)

    if (n <= 2) 1
    else fibHelper(2, 1, 1)
  }

  //println(tailFib(1000))

  def fib(n: Int): Int =
    if (n <= 2) 1
    else fib(n-1) + fib(n-2)

  //println(fib(10))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean=
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }

  def isPrimeRec(n: Int): Boolean ={
    def isPrimeHelp(t: Int): Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeHelp(t-1)

    isPrimeHelp(n/2)
  }
  //println(isPrimeRec(13))
  //println(isPrime(100000257))


  def isPrimeTail(n: Int): Boolean ={
    def isPrimeTailrec(t: Int, primeUntil: Boolean): Boolean =
      if (!primeUntil) false
      else if(t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0)

    isPrimeTailrec(n/2, true)
  }

  def newPrime(n: Int): Boolean = {
    def helpPrime(t: Int, divisor: Int): Boolean =
      if (divisor == 1) true
      else if (t % divisor == 0) false
      else helpPrime(t, divisor - 1)

    helpPrime(n, n/2)
  }

  println(newPrime(10))
  println(isPrimeTail(89))
}