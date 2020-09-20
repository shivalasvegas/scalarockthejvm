package lectures.part2oopbasics

object Objects extends App{
  //Scala does not have class level functionality ("static")
  // Objects can have static like functionality
  // objects can have vals vars and methods
  object Person {
    // an object is a singleton instance - defining type and only instance
    // static/class - level functionality
    val N_EYES = 2
    def canFly: Boolean = false
    //factory method - build Persons given some parameters
    def from(mother: Person, father: Person): Person = new Person("Bobby")
    def apply(mother: Person, father: Person): Person = new Person("Bobby")
  }
  class Person(val name: String){
    // Instance level functionality
  }
  // Companions: reside in the same scope and have the same name

  println(Person.N_EYES)
  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary==john) // => false

  val person1 = Person
  val person2 = Person
  println(person1==person2)  // => true
  // single instance that can be referered to by Person
  val bobby1 = Person.from(mary, john)
  val bobby2 = Person(mary, john)

  // scala applications - is a scala object with
  // def main(args: Array[String]): Unit

}
