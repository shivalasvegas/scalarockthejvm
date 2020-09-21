package lectures.patternmatching


object AllThePatterns extends App{

  // constants
    val x: Any = "Scala"
  val constants = x match {
    case 1 => "a number"
    case "Scala" => "The scala"
    case AllThePatterns => "A singleton"
    case _ => "argh!"
  }

  //Match anything
  val matchAnything = x match {
    case _ =>
  }

  val matchVariable = x match {
    case something => s"I've found $something"
  }

  //3. Tuples
  val aTuple = (1, 2)
  val matchATuple  = aTuple match {
    case (1, 1) =>
    case (something, 2) => s"I've found $something"
  }

  val nestedTuple = (1, (2, 3))
  val matchNestedTuple = nestedTuple match {
    case (_, (2, v)) =>

  }

  //4. case classes
  //val aList = MyList1[Int]

  //5. list patterns
  val aStandardList = List(1, 2, 3, 42)
  val standardListMatching = aStandardList match {
    case List(1, _, _, _) => // extractor
    case List(1, _*) => //list of arbitrary lenngth
    case 1 :: List(_) => //infix pattern

  }

  //6. type specifiers
  val unknown: Any = 2
  val unknownMatch = unknown match {
    case list: List[Int] => //explicit type specifier
    case _ =>
  }

  //7. NMame binding
//  val nameBindingMatch = aList match {
//    case nonEmptyList @.Cons(_, _) =>
//  }

  //8. multi pstterns
//  val multiPattern = aList match {
//    case Empty | Cons(0, _) => // compound pattern
//  }

  //9. - if guards
//  val secondElementSpecial = aList match {
//    case Cons(_, Cons(specialElement, _)) if specialElement % 2 == 0 =>
//  }

  val numbers = List(1, 2, 3)
  val numbersMatch = numbers match {
    case listOfStrings: List[String] => "a list of strings"
    case listOfNumbers: List[Int] => "a list of numbers"
    case _ => "neither one or the other"
  }
  println(numbersMatch)
  // JVM trick question
}
