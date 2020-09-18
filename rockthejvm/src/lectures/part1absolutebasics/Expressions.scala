package lectures.part1absolutebasics

object Expressions extends App{

  val x = 1+2  //expression
  println(x)
  // operators
  // + - * / & | << >> >>> (right shift with zero extension)
  // == <= => !=
  //! && ||

  var aVar = 2
  aVar += 3  // also works with -= *= /= ... side effects

  // Instructions vs expressions
  // Instructions: Something you tell the computer to do

  // if expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // evaluates to 5
  println(aConditionedValue)

//  var i = 0
//  while (i<10){
//    println(i)
//    i += 1
//  }
  // NEVER WRITE THIS AGAIN!  This code is imperative
  // everything in Scala is an expression
  val aWeirdValue = (aVar = 3)
  println(aWeirdValue)

  // Code blocks are an expression
  // The value of the block is the value if the last expression
  // values declared inside the code block are only available
  // the scope of the code block
  val aCodeBlock = {
    val y = 2
    val z = y+1

    if(z>2) "hello" else "goodbye"
  }

}
