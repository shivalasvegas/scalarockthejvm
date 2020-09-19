package lectures.part2oopbasics

object OOBasics extends App{
  val person  = new Person("John", 26)
  println(person.age)
  person.greet("Daniel")
  person.greet("Peter")

  val writer = new Writer("Jacinda", "Gregor", 35)
  println(writer.fullName())
  val book = new Novel("The Issues with Tissues", 1990, writer)
  println(s"Title: ${book.title}; Author: ${book.isWrittenBy()}; Year published: ${book.year}")
  val newBook = book.copy(1992)
  println(s"Title: ${book.title}; Author: ${book.isWrittenBy()}; Year published: ${newBook.year}")

  val myCounter = new Counter(0)
  myCounter.increment.printCount
  myCounter.increment(10).printCount

}

//constructor
class Person(name: String, val age: Int) {
  // class body
  // values and vars are fields
  val x = 2
  println(1+3)
  // everything inside the class body is executed
  // method
  def greet(name: String): Unit =  println(s"${this.name} says hi $name")
  // overloading
  def greet(): Unit = println(s"Hi $name")

  //multiple contructors
  def this(name: String) = this(name, 0)
  def this() = this("John")

}

// class parameters are not class fields
// Name is not a class parameter , age is
//Exercises:
// Writer class: firstname surname year
// method: fullname
class Writer(val firstname: String, val surname: String, val age: Int){
  def fullName(): String = s"$firstname $surname"
}

//novel class: title, year, author
//method: authorAge
//method isWrittenBy(author)
//method: copy (new year of release) = new instance of novel
class Novel(val title: String, val year: Int, val author: Writer){

  def isWrittenBy(): String = author.fullName()

  def copy(newYear: Int): Novel = new Novel(title, newYear, author)

}

//counter class
//method current counter
//method increment/decrement => new counter
//overload inc/dec to receive an amount

class Counter(val count: Int){

  def increment = {
    println("Incrementing ...")
    new Counter(count+1)
  } // immutability
  def increment(num: Int): Counter = {
    if (num<=0)this
    else increment.increment(num-1)
  }

  def decrement = {
    println("Decrementing ...")
    new Counter(count-1)
  }
  def decrement(num: Int): Counter = {
    if (num<=0)this
    else decrement.decrement(num-1)
  }

  def printCount = println(count)

}

