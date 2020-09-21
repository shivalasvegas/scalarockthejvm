package lectures.part3functionalprogramming

import scala.collection.immutable.List

object MapFlatMapFilterFor extends App {

  val list  = List(1, 2, 3)
  println(list)

  println(list.head)
  println(list.tail)

  // Map
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  //filter
  println(list.filter(_ % 2 == 0))

  //flatmap
  val toPair = (x: Int) => List(x, x+1)
  println(list.flatMap(toPair))

  // print all combinations between 2 lists
  val numbers = List(1, 2, 3, 4)
  val characters = List('a', 'b', 'c', 'd')
  // Interating
  val combination = numbers.flatMap(n=>characters.map(c => "" + c + n))
  println(combination)

  // for each
  list.foreach(println)

  // for comprehensions
  val forCombinations = for {
    n <- numbers
    c <- characters
  } yield "" + c + n
  println(forCombinations)

  // syntax overload
  list.map {x =>
    x*2
  }

  /*
  1. MyList
  2. Small collection of at most One element Maybe(+T)
    -map, -flatmap, filter
   */
}
