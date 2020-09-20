package exercises

abstract class MyList3[+A] {

  def headList: A

  def tailList: MyList3[A]

  def isListEmpty: Boolean

  def add[B >: A](element: B): MyList3[B]

  def printElements: String
  override def toString: String = "[" + printElements + "]"

}

object Empty3 extends MyList3[Nothing]{
  def headList: Nothing = throw new NoSuchElementException
  def tailList: MyList3[Nothing] = throw new NoSuchElementException
  def add[B >: Nothing](element: B): MyList3[B] = new Cons3(element, this)
  def isListEmpty: Boolean = true
  def printElements: String = ""
}

class Cons3[+A](h: A, integerList: MyList3[A]) extends MyList3[A]{
  def headList: A = h
  def tailList: MyList3[A] = integerList
  def isListEmpty: Boolean = false

  def add[B >: A](element: B): MyList3[B] = new Cons3(element, this)
  def printElements: String =
    if(integerList.isListEmpty) "" + h
    else h + " " + integerList.printElements
}

object Lists3 extends App{
  val listOfIntegers: Cons3[Int] = new Cons3(1, new Cons3(2, new Cons3(3, Empty3)))
  val listOfStrings: Cons3[String] = new Cons3("Hello", new Cons3("World", new Cons3("!", Empty3)))
  println(listOfIntegers.headList)
  println(listOfIntegers.add(4).headList)
  println(listOfIntegers.isListEmpty)

  println(listOfStrings.headList)
  println(listOfStrings.add("Boo!").headList)
  println(listOfStrings.isListEmpty)

}

