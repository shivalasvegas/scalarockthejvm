package lectures.part2oopbasics

import scala.language.postfixOps

object MethodNotations extends App{

  class Person (val name: String, favouriteMovie: String){
    def likes(movie: String): Boolean = movie == favouriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    // + is a valid method name
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // both are equivalent
  //infix notation = operator notation single parameter
  // methods with a dingle paramenter can be alled with infix notation
  //syntactic sugar

  //"Operators" scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)
  println(mary + tom)
  // maths operators are methods - ie all operators are methods

  // Prefix notation
  // another form of syntactic sugar
  val x = -1 // equivalent to 1.unary_-
  // only works with + - ~ !
  println(!mary)
  println(mary.unary_!)

  // Postfix notation
  println(mary.isAlive)
  println(mary isAlive)
  // can be used when method doesn't take in a parameter
  // need to import scala.language.postfixOps

  //Apply
  println(mary.apply())
  println(mary()) // equivalent
  // compiler looks for an apply method in the class scope and calls that method

// 1. overload the + operator
  // mary + "The Rockstar" = > new Person "Mary (the rockstar)"
  //2. Add an age to the person class
  // add a unary + operator => new Person with age +1
  //3. Add  a "learns" method in the person class
  // String => Mary learns scala
  // Add a learnsscala method , calls learns methos with "scala"
  // use it in postfix notations
  //4. overload the apply method
  // mary.apply(2) => "Mary watched Inception 2 times"


}
