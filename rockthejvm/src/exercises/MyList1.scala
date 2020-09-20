package exercises

abstract class MyList() {
    // holds integers
  val integerList = List[Int]()

    // head = returns first element of list
  def headList: Int
    // trail = returns remainder of list
  def tailList: List[Int]
    // isEmpty = is this list empty
  def isListEmpty: Boolean
    // add(int) => new list with element added
  def add(num: Int): MyList
    // toString => a string representation of the list
  def listToString: String

}
trait PrintList{
  def printListToConsole: Unit
  def printStringToConsole: Unit
  def printHeadToConsole: Unit
  def printTailToConsole: Unit
}

object Empty extends MyList{
  def headList: Int = ???

  def add(num: Int): MyList = ???

  def listToString: String = ???

  def tailList: List[Int] = ???

  override val integerList = ???

  def isListEmpty: Boolean = ???
}

class NewList(integerList: List[Int]) extends MyList with PrintList{

  def isListEmpty: Boolean = if (integerList.isEmpty) true else false

  def add(num: Int): NewList = new NewList(integerList:+num)

  def headList: Int = integerList.head

  def tailList: List[Int] = integerList.tail

  def listToString: String = integerList.toString()

  def printListToConsole = println(s"My integer list: $integerList")
  def printStringToConsole = println(s"My integer list as a String: $listToString")
  def printHeadToConsole = println(s"The head of my list is: $headList")
  def printTailToConsole = println(s"the tail of my list is: $tailList")
}

object Lists extends App{

  val list1 = new NewList(List[Int](1, 2, 3, 4, 5))
  list1.printListToConsole
  println(s"The first member of my list is ${list1.headList}")
  println(s"The other members od my list are ${list1.tailList}")
  list1.printStringToConsole
  list1.printHeadToConsole
  list1.printTailToConsole

  val list2 = list1.add(7)
  list2.printListToConsole

}
