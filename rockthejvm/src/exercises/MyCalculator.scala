package exercises

object MyCalculator extends App{

  class BasicCalculator(num1: Int, num2: Int) {
    val MAX_INT = 100
    val MIN_INT = 0
    def add: Int = num1+num2
    def sub: Int = num1-num2
    def mult: Int = num1*num2
    def div: Float = num1.toFloat/num2.toFloat
    def checkAddLimit: Boolean =
      if (num1 + num2 > MAX_INT) {
        throw new OverFlowException
        false
      } else true

    def checkSubLimit: Boolean =
      if (num1 - num2 < MIN_INT) {
        throw new UnderFlowException
        false
      } else true

       def checkDivLimit: Boolean =
         if (num2 == 0) {
           throw new MathCalculatorException
           false
         }
         else true

  }

  class OverFlowException extends Exception{
    println("Hey that's over 100! You've exceeded the max addition limit!")
  }

  class UnderFlowException extends Exception{
    println("Argh! A negative number ... you've exceeded the min subtraction limit!")
  }

  class MathCalculatorException extends Exception{
    println("Oh snap! Divide by zero?!")
  }


  val calcMe = new BasicCalculator(76, 0)
  println(calcMe.mult)
  if (calcMe.checkDivLimit) println(calcMe.div)
  if (calcMe.checkAddLimit) println(calcMe.add)
  if (calcMe.checkSubLimit) println(calcMe.sub)


}

  /*  pocket calculator -
        add(x, y)
        sub()
        mult()
        div()
        Throw
        -OverFlowException if add(xy) exceeds Int.MAX_VALUE
        -UnderflowException if sub() exceeds Int_MIN_VLAUE
        -MathCalculatorException for divide by 0
  */
