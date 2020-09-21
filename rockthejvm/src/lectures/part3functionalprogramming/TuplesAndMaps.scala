package lectures.part3functionalprogramming

object TuplesAndMaps extends App {
    // tuples
    // finite ordered lists
    val aTuple1 = new Tuple2[Int, String](2, "hello, scala")
  val aTuple2 = Tuple2[Int, String](2, "hello, scala")
  val aTuple3 = (2, "hello, scala")

  println(aTuple1._1) // => 2
  println(aTuple1.copy(_2 = "Goodbye"))
  println(aTuple1.swap)

  // Maps - keys -> values
  val aMap: Map[String, Int] = Map()
  val phonebook = Map(("Jim", 555), ("Daniel", 777), "Peter" -> 789).withDefaultValue(-1)
  println(phonebook)

  println(phonebook.contains("Jim")) // => true
  println(phonebook("Jim")) // => 555
  println(phonebook("Mary"))

  // add a pairing
  val newPairing = "Mary" -> 678
  val newPhonebook = phonebook + newPairing

  // Functionals
  //println(phonebook.map(x => x._1.toLowerCase -> x._2)

  // Filter
  //println(phonebook.filter(x => x.startsWith))

  // map values
  //println(phonebook.mapValues(number => "0245-" + number))

  // conversions
  println(phonebook.toList)
  println(List(("Daniel", 555)).toMap)
  val names = List("Bob", "James", "Mary", "Daniel", "Jim")
  println(names.groupBy(name => name.charAt(0)))

  // update elements by reassigning them
  //phonebook("Mary") = "Jim"
  /*
  1. What would happen if I have two original entries "Jim" -> 555, "JIM" -> 900?
  2. Overly simplified social network based on maps
      - Person = String
      - Add a Person
      - Remove
      - Friend
      - unfriend
      - number of friends of a person
      - person with most friends
      - how many people have no friends
      - If there is a social connection between two people
   */


}
