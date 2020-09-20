package lectures.part3functionalprogramming

object WhatsAFunction extends App {
  // Use and work with functions as first class elements
  // Problem: We come from an oop world

  val doubler = new MyFunction[Int, Int] {
    override def execute(element: Int): Int = element *2
  }
  println(doubler.execute(2))

  // function types = Function[A, B]
  val stringToIntConverter = new Function1[String, Int] {
    override def apply(string: String): Int = string.toInt
  }
  println(stringToIntConverter("3") + 4)

  //val adder ((Int, Int) => Int) = new Function2[Int, Int, Int] {
  //Function types Function2[A, B, R] === (A, B) => R
    val adder = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a+b
  }

  def concatenator: (String, String) => String = new Function2[String, String, String]{
    override def apply(a: String, b: String): String = a+b
  }

  val concatenate = new Function2[String, String, String] {
    override def apply(a: String, b: String): String = a+b
  }

  println(concatenate("Functions", " are fun!"))
  println(concatenator("If", " you follow!"))

  val order1: Function1[Int, Function1[Int, Int]]= new Function1[Int, Function1[Int, Int]] {
    override def apply(num1: Int): Function1[Int, Int] = new Function[Int, Int] {
      override def apply(num1: Int): Int = num1*2
    }
  }
  val order2 = order1(3)
  println(order2(4))
  println(order1(3)(10)) // curried function a function which calls another function

  // All scala functions are objects or instances of Functions

  /*
  1. function which takes two strings and concatenates them
  2.
  3. function takes an int and returns another function which takes an int and returns an int
    - What's the type of this function
    - How to do it?
   */

}



trait Action[A, B]{
  def apply(element: A): B
}

trait MyFunction[A, B]{
  def execute(element: A): B
}

//class Action {
//  def execute(element: Int): String = ???
//}
