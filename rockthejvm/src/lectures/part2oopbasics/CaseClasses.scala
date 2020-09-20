package lectures.part2oopbasics

object CaseClasses extends App{
  /*
  equals, hashcode, toString
   */
  case class Person(name: String, age: Int)
  //1. class parameters are fields
  val jim = new Person("Jim", 52)

  //2. sensible toString
  // println(instance) = println(isntance.toString
  println(jim.toString)

  //3. equals and hashcode impleamented out of the box
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  //4. Case classes have handy copy method
  val jim3 = jim.copy(age=45)
  println(jim3)

  //5. Case classes have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)  // does the same thing as the constructor

  //6. Case classes are serialisable
  // Akka

  //7. Case classes have extractor patterns  => PATTERN MATCHING

  //8. You can also have case objects
  case object UnitedKingdom {
    def name: String = "The UK"
  }


}
//Expand MyList to use case classes and objects