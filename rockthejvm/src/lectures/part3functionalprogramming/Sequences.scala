package lectures.part3functionalprogramming

import scala.util.Random

object Sequences extends App{
  //Sequences - well defined order and can be indexed
  val aSequence = Seq(1, 3, 2, 4, 5)
  println(aSequence.reverse)
  println(aSequence(2))
  println((aSequence ++ Seq(6, 9, 8, 7, 10)).sorted)
  println(aSequence.sorted)

  //Range
  val aRange: Seq[Int] = 1 until 10
  aRange.foreach(println)
  (1 to 5).foreach(x => println("Hiya!"))

  // Lists
  val aList = List(1, 2, 3)
  val prependedList = 42 :: aList
  println(prependedList)

  val apples5 = List.fill(5)("apple")
  println(apples5)
  println(aList.mkString("-|-"))

  // arrays
  val numbers = Array(1, 2, 3)
  val threeNumbers = Array.ofDim[Int](3)
  // mutation
  numbers(2) = 0
  println(numbers.mkString(" "))

  // arrays and sequences
  val numbersSeq: Seq[Int] = numbers // Implicit conversions
  println(numbersSeq)

  // Vectors
  val vector: Vector[Int] = Vector(1, 2, 3)
  println(vector)

  // vectors vs Lists
  val maxRuns  = 1000
  val maxCapacity = 1000000
  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random
    val times = for {
      it <- 1 to maxRuns
    }yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), r.nextInt())
      System.nanoTime() - currentTime
    }
    times.sum * 1.0
  }

  val numbersList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector
  // keeps reference to tails
  println(getWriteTime(numbersList))
  // depth of the tree is small
  // needs to replace an entire 32-element chunk
  println(getWriteTime(numbersVector))

}
