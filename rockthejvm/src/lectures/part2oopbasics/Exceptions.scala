package lectures.part2oopbasics

object Exceptions extends App{

 val x: String = null
//  This will throw a nullPointerException
//  println(x.length)

  // Throwing and catching exceptions
  //val aWeirdValue: String = throw new NullPointerException

  // throwable classes extend the thhrowable class
  // Exception a Error are the major throwable subtypes
  // Error => Something wrong with the system

  // How to catch exceptions

  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No int for you")
    else 42

  try {
    // code that might throw
    getInt(true)
  }catch{
    case e: RuntimeException => println("Caught a RunTimeException")
  }finally {
    // Code that gets exceuted no matter what
    // does not influence the return type of this expression
    // use finally only for side effects
    println("Finally!")
  }

  // How to make your own exception classes

  class MyException extends Exception
  val exception = new MyException
  //throw exception

  /*
  crash programme with an out of memory error
  crash with a stack overflow error
  pocket calculator -
    add(x, y)
    sub()
    mult()
    div()
    Throw
    -OverFlowException if add(xy) exceeds Int.MAX_VALUE
    -UnderflowException if sub() exceeds Int_MIN_VLAUE
    -MathCalculatorException for divide by 0
   */

}
