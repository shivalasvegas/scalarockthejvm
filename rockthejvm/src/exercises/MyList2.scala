package exercises

abstract class MyList2() {
  // head = returns first element of list
  def headList: Int
    // trail = returns remainder of list
  def tailList: MyList2
    // isEmpty = is this list empty
  def isListEmpty: Boolean
    // add(int) => new list with element added
  def add(element: Int): MyList2
    // toString => a string representation of the list
  def printElements: String
  override def toString: String = "[" + printElements + "]"
}

object Empty2 extends MyList2{
  def headList: Int = throw new NoSuchElementException
  def tailList: MyList2 = throw new NoSuchElementException
  def add(element: Int): MyList2= new Cons(element, Empty2)
  def isListEmpty: Boolean = true
  def printElements: String = ""
}

class Cons(h: Int, integerList: MyList2) extends MyList2{
  def headList: Int = h
  def tailList: MyList2 = integerList
  def isListEmpty: Boolean = false

  def add(element: Int): MyList2 = new Cons(element, this)
  def printElements: String =
    if(integerList.isListEmpty) "" + h
    else h + " " + integerList.printElements

}

object Lists2 extends App{
val list = new Cons(1, new Cons(2, new Cons(3, Empty2)))
println(list.headList)
  println(list.add(4).headList)
  println(list.isListEmpty)

}

