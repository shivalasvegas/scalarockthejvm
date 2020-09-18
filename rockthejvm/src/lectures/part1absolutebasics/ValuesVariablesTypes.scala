package lectures.part1absolutebasics

object ValuesVariablesTypes extends App {
  // vals are immutable they cannot be changed.
  // The compiler can infer types
  val x: Int = 42
  println(x)
  val aString: String = "Hello this  is a string"
  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val aShort: Short = 4556
  val aLong: Long = 3524562464365474257L
  val aFloat: Float = 2.90F
  val aDouble: Double = 3.44535235354

  //Variables
  var aVariable: Int = 4  // side effects

}
