package lectures.part1absolutebasics

import scala.annotation.tailrec

object Recursion extends App{
  // factorial function
  // each block calls a stack frame
  def factorial(n: Int): Int = {
    if (n<=1) 1
    else {
      println("Computing factorial of" + n)
      val result: Int = n * factorial(n - 1)
      println("Computed factorial of" + n)
      result
    }
  }
  println(factorial(10))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: BigInt, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) // Tail recursion
    }
    factorialHelper(n, 1)
  }

  anotherFactorial(10)
  //Use a recursive call as the last expression
  //anotherFactorial(10) =
  //factorialHelper(10, 1) =
  // else: factorialHelper(9, 10*1)
  // else: factorialHelper(8, 9*10*1)
  // else: factorialHelper(7, 8*9*10*1) ...
  // else: factorialHelper(1, 1*2*3* ... *10)
  // returns accumulator
  // When you need loops use tail recursion

  //1. concatenate a string n times
  //2. IsPrime: change to recursive
  //3. fibonacci: change to recursive
      @tailrec
      def nameRecursion(n: Int, name: String, accumulator: String): String  =
          if (n<=0) accumulator
          else  nameRecursion(n-1, name, name+accumulator)

      println(nameRecursion(5, "Frank", ""))


      def isPrime(n: Int):Boolean = {
        @tailrec
        def isPrimeUntil(t: Int): Boolean =
          if (t<=1) true
          else n%t != 0 && isPrimeUntil(t-1)

        isPrimeUntil(n/2)
      }
      println(isPrime(5))

      def fibonacci(n: Int): Int = {
        @tailrec
        def fibHelper(x: Int, last: Int, nextToLast: Int): Int =
          if (x >= n) last
          else fibHelper(x+1, last+nextToLast, last)

        if (n<=2)1
        else fibHelper(2, 1, 1)
      }

  println(fibonacci(8))

}

