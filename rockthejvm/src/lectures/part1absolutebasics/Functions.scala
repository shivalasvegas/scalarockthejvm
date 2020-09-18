package lectures.part1absolutebasics

object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + "" + b
  }



  println(aFunction("hello", 3))
  def aParamLessFunction(): Int = 42
  println(aParamLessFunction())

  // When you need loops, use recursion
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)

  }
  println(aRepeatedFunction("hello", 3))

  // Function with side effects
  def aFunctionWithSideEffects(aString: String): Unit = println("Hello")

  // Function within a function
  def aBigFunction(a: Int): Int = {
    def aSmallFunction(b: Int, c: Int): Int = c+b
    aSmallFunction(a, a-1)  //return value
  }

  def nameAgeFunction(name: String, age: Int): Unit = {
    println("Hello, my name is " + name + " and I'm " + age)
  }
  nameAgeFunction("Frank", 56)

  //Factorial function 1*2*3 ... n
  def factorialFunction(n: Int): Int = {
    if (n<=0) 1
    else {
      n * factorialFunction(n - 1)
    }
  }

  println(factorialFunction(4))

  // Fibonacci number 1, 1, 2, 3, 5,
  //f(n) = f(n-1) + f(n-2)

  def fibonacciFunction(n: Int): Int = {
    if (n<=2) 1
    else{
      fibonacciFunction(n-1)+fibonacciFunction(n-2)
    }
  }
  println(fibonacciFunction(4))

  // does n have any divisors until t
  def isPrime(n: Int):Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t<=1) true
      else n%t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }
  if (isPrime(4)) println("We have a winner")
  else println("Boo!")

}
