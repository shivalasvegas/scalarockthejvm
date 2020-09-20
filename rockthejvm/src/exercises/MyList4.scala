package exercises

abstract class MyList4[+A] {
  /*
  def headList: A

  def tailList: MyList4[A]

  def isListEmpty: Boolean

  def add[B >: A](element: B): MyList4[B]

  def printElements: String
  override def toString: String = "[" + printElements + "]"

  def map[B] (transformer: MyTransformer[A, B]): MyList[B]
  def flatMap[B](transformer: MyTransformer[A, MyList[B]]): MyList[B]
  def filter(predicate: MyPredicate[A]): MyList[A]

}

object Empty4 extends MyList4[Nothing]{
  def headList: Nothing = throw new NoSuchElementException
  def tailList: MyList4[Nothing] = throw new NoSuchElementException
  def add[B >: Nothing](element: B): MyList4[B] = new Cons4(element, this)
  def isListEmpty: Boolean = true
  def printElements: String = ""
  def map[B] (transformer: MyTransformer[Nothing, B]): MyList[B] = Empty4
  def flatMap[B](transformer: MyTransformer[Nothing, MyList[B]]): MyList[B] = Empty4
  def filter(predicate: MyPredicate[Nothing]): MyList[Nothing] = Empty4
}

class Cons4[+A](h: A, integerList4: MyList4[A]) extends MyList4[A]{
  def headList: A = h
  def tailList: MyList4[A] = integerList4
  def isListEmpty: Boolean = false

  def add[B >: A](element: B): MyList4[B] = new Cons4(element, this)
  def printElements: String =
    if(integerList4.isListEmpty) "" + h
    else h + " " + integerList4.printElements

  def map[B] (transformer: MyTransformer[A, B]): MyList[B]
  def flatMap[B](transformer: MyTransformer[A, MyList[B]]): MyList[B]
  def filter(predicate: MyPredicate[A]): MyList[A] =
    if (predicate.test(h)) new Cons4(h, integerList4.filter(predicate))
    else integerList4.filter(predicate)
}

trait MyPredicate[-T] {
  def test(elem: T): Boolean
}

trait MyTransformer[-A, B] {
  def transform(elem: A): B
}

object Lists4 extends App{
  val listOfIntegers: Cons4[Int] = new Cons4(1, new Cons4(2, new Cons4(3, Empty4)))
  val listOfStrings: Cons4[String] = new Cons4("Hello", new Cons4("World", new Cons4("!", Empty4)))
  println(listOfIntegers.headList)
  println(listOfIntegers.add(4).headList)
  println(listOfIntegers.isListEmpty)

  println(listOfStrings.headList)
  println(listOfStrings.add("Boo!").headList)
  println(listOfStrings.isListEmpty)

}

//1. Create a generic trait - MyPredicate[T]
// - test[T] => boolean
//2. Create a generic trait - MyTransformer[A, B]
//3. MyList:
// - map(tranformer) => MyList
// - filter(predicate) => MyList
// - flatMap(transformer from A to MyList[B] => MyList[B]
// class EventPredicate extends MyPredicate[Int]
// class StringToIntTransformer extends MyTransformer[String, Int]
// [1, 2, 3].map(n*2) = [2, 4, 6]
// [1, 2, 3, 4].filter(n%2) = [2,4]
// [1, 2, 3].flatMap(n=> [n, n+1]) => [1, 2, 2, 3, 3, 4, 4]

}
 */
}