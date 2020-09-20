package lectures.part3functionalprogramming

object AnonymousFunctions extends App{

  val doubler  = new Function[Int, Int] {
    override def apply(x: Int) = x*2
  }

  // anonymous function (LAMBDA)
  // instnace of Function1
  val doubler2: Int => Int = (x: Int) => x*2
  val doubler3: Int => Int = x => x*2

  // multiple parameters?
  val adder: (Int, Int) => Int = (a, b) => a+b

  //no parameters?
  val doSomething: () => Int = () => 3
  println(doSomething())

  // curly braces
  val stringToInt = {(str: String) =>
    str.toInt
  }

  // MOAR syntactic sugar
  val niceIncrementer: Int => Int = _ + 1 // equivalent to x=>x+1
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (a, b)=> a+b

  /*
    1. In MyList replace all function x calls with lambdas
    2. Rewrite the special adder as an anonymous function
   */

  val specialDoubler = (x: Int) => (y: Int) => y*2

}
