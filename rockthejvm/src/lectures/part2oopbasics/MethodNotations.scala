package lectures.part2oopbasics

import scala.language.postfixOps

object MethodNotations extends App{

  class Person (val name: String, favouriteMovie: String, val age: Int){
    def likes(movie: String): Boolean = movie == favouriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    // + is a valid method name
    //def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(rockstar: String):  Person = new Person(name=this.name + " " + rockstar, favouriteMovie, age)
    def unary_! : String = s"$name, what the heck?"
    def unary_+ : Person = new Person(name, favouriteMovie, age = this.age+1)
    def isAlive: Boolean = true
    def learns(subject: String): String = s"$name is learning $subject"
    def learnsScala(): String = learns("Scala")
    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
    def apply(num: Int): String = s"Mary has watched $favouriteMovie $num times"
  }

  val mary = new Person("Mary", "Inception", 23)
  println(mary.likes("Inception"))
  println(mary likes "Inception") // both are equivalent
  //infix notation = operator notation single parameter
  // methods with a dingle paramenter can be alled with infix notation
  //syntactic sugar

  //"Operators" scala
  val tom = new Person("Tom", "Fight Club", 24)
  println(mary hangOutWith tom)
  //println(mary + tom)
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
  println((mary + "Bowie").name)
  //2. Add an age to the person class
  // add a unary + operator => new Person with age +1
  println("Hi I'm " + mary.name + " and I'm " + mary.age)
  println("Hi I'm " + (mary.unary_+ + "Lorde").name + " and I'm " + mary.unary_+.age)
  //3. Add  a "learns" method in the person class
  // String => Mary learns scala
  // Add a learnsscala method , calls learns method with "scala"
  // use it in postfix notation
  println(mary.learns("piano"))
  println(mary learnsScala)

  //4. overload the apply method
  // mary.apply(2) => "Mary watched Inception 2 times"
  println(mary(2))

}
