package lectures.part1absolutebasics

import scala.annotation.tailrec

object DefaultArgs extends App{

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: BigInt, accumulator: BigInt = 1): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) // Tail recursion

    factorialHelper(n, 1)
  }

  def picture(format: String, width: Int, height: Int): Unit = println("Saving picture")
  // default values cannot be omitted
  picture("jpg", 800, 600)

  def savePicture(format: String = "jpg", width: Int = 800, height: Int = 600): Unit = println("Saving picture")
  // default values cannot be omitted
  picture(format = "jpg", width = 800, height=600)
// we can either pass in every leading argument
  // or we can name the arguments
}
