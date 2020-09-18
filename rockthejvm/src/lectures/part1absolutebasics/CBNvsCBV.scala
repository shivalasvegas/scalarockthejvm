package lectures.part1absolutebasics

object CBNvsCBV extends App{

  def callByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  // x evaluated each time it's called
  def callByName(x: => Long): Unit = {
    println("by Name: " + x)
    println("by Name: " + x)
  }

  // function evaluated before called
  // same value used everywhere
  callByValue(System.nanoTime())
  // expression evaluated twice here
  // evaluated at every use
  callByName(System.nanoTime())

  def infinite(): Int = 1+infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(), 34)
  printFirst(34, infinite())

}
