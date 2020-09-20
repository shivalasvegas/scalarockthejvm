package lectures.part2oopbasics

object AnonymousClasses extends App {
    abstract class Animal{
      def eat: Unit
    }
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("hahahahahahahah")
  }
  //compiler creates a class with an anonymous name
  // equivalent with
  // class AnonymousClasses$$anon$1 extends Animal{
  // override def eat: Unit = println("hahahahahahahah")
  //val funnyAnimal: Animal = new AnonymousClasses$$anon$1

  println(funnyAnimal.getClass)
  // Anonymous classes work for abstract traits/classes and non-abstract classes
  class Person(name: String){
    def sayHi: Unit = println(s"Hi my name is $name, how can I help you")
  }
  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi my name is Jim, how can I help you")
  }
}
