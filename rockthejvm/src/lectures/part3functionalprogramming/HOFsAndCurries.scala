package lectures.part3functionalprogramming

object HOFsAndCurries extends App {
  // Higher Order function
  val superFunction: (Int, (String, (Int=> Boolean)) => Int) => (Int => Int) = null

  // Function that applies another function n times over a value x
  // nTimes(f, n, x)
  // nTimes(f, 3, x) = f(f(f(x))) = ntimes(f, 2, f(x))
  // nTimes(f, n, x) = f(f(...f(x) = nTimes(f, n-1, f(x))

  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n<=0) x
    else nTimes(f, n-1, f(x))

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne, 10, 1))

  // increment10 = ntb(plusOne, 10) = x=> plusOne(plusOne ... (x))
  // val y = increment10(1)
  def nTimesBetter(f: Int => Int, n:Int): (Int => Int) =
    if (n<=0) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n-1)(f(x))

  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1))

  // curried functions
  val superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x+y
  val add3 = superAdder(3)
  println(superAdder(3)(10))

  //functions with multiple parameter lists
  def curriedFormatter(c: String)(x: Double): String = c.format(x)
  val standardFormat: (Double => String) = curriedFormatter("%4.2f")
  val preciseFormat: (Double => String) = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))

  /*
  1. MyList
  2. Method toCurry (f: (Int, Int) => Int) => (Int => Int => Int)
  3. compose (f, g) => x => f(g(x))
             (f, g) => x => g(f(x))
   */

  //2. Method toCurry (f: (Int, Int) => Int) => (Int => Int => Int)
  def toCurry(f: (Int, Int) => Int): (Int => Int => Int) = (x: Int) => (y: Int) => f(x, y)
  def fromCurry(f: (Int => Int => Int)): (Int, Int) => Int = (x, y) => f(x)(y)

  // Generic version
  def composer[A, B, T](f: A => B, g: T => A): T => B = x => f(g(x))
  def compose(f: Int => Int, g: Int => Int): Int => Int = (x: Int) => f(g(x: Int))
  def andThen(f: Int => Int, g: Int => Int): Int => Int = (x: Int) => g(f(x: Int))


}
