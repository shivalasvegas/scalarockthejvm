package lectures.patternmatching

import java.beans.Expression

import scala.util.Random

object PatternMatching extends App{
  val random = new Random
  val x = random.nextInt(10)

  val description = x match {
    case 1 => "the one"
    case 2 => "douible or nothing"
    case 3 => "third times a charm"
    case _ => "soethins else"
  }

  println(x)
  println(description)

  case class Person(name: String, age: Int){
    val bob = Person("Bob", 20)

    val greeting = bob match {
      case Person(n, a) if a< 21 => s"Hi my name is $n and I am $a years old"
      case _ => "I don't know who I am"
    }

    println(greeting)
  }

  /*
  1. cases are matched in order
  2. matcherror if cases don't match
  3. type of PM expession? unified type
   */

  // PM on sealed hierarchies
  sealed class Animal
  case class Dog(breed: String) extends Animal
  case class Parrot(greeting: String) extends Animal

  val animal: Animal = Dog("Pip")
  animal match {
    case Dog(somebreed) => println(s"Matched a dog to $somebreed")
    case _ => println("no match")
  }

  /*
  Exercises
  takes an experssion
  sum(num(2), num(3)) => 2+3
  product(num(2), num(3)) => 2*3
   */
  sealed class Expressions
  case class Sum(num1: Int, num2: Int) extends Expressions
  case class Product(num1: Int, num2: Int) extends Expressions

  val number1 = 2
  val number2 = 3
  val addition: Expressions = Sum(number1, number2)
  val multiply: Expressions = Product(number1, number2)

  val mySum = addition match {
    case Sum(x, y) => println(s"The sum of $x and $y = ${x+y}")
    case _ => "Opps!"
  }

  val myProd = multiply match {
    case Product(x, y) => println(s"The sum of $x and $y = ${x*y}")
    case _ => "Opps!"
  }
  

}
