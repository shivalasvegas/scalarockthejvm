package lectures.part2oopbasics

object Inheritance extends App{
    // Single class inheritance
    // access modifiers
    // public members of classes are accessed everywhere
    // however private members are accessed within class
    // private
    // protected - usable within this class and subclasses, but not outside the scope of these
    sealed class Animal {
      def eat = println("nom nom nom")
      private def speak = println("squark squark")
      protected def laugh = println("Pft pft")
      val creatureType = "wild"
      val food = "meat"
    }

    class Cat extends Animal{
      def crunch = {
        eat
        println("crunch crunch")
      }

      def chuckle = {
        laugh
        println("mew mew")
      }

    }
    val cat = new Cat
    cat.eat

    //Constructors
    class Person(name: String, age: Int){
      def this(name: String) = this(name, 0)
    }
    class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //Overriding can be done as a parameter
  class Dog(override val food: String) extends Animal{

    override val creatureType: String = "domestic"
    override def eat {
      super.eat
      println("yukka yukka")
    }
  }
  // class dog
  val dog = new Dog("bones")
  dog.eat
  println(dog.creatureType)

  // type substitution (broad polymorphism)
  val unknownAnimal: Animal = new Dog("milk")
  unknownAnimal.eat
  // make distinction between overriding and overloading

  // super reference method from parent class

  // To prevent overrides:
  // 1. use final on class/methods/val
  // 2. seal the class = extends classes in this file
  // and prevents extension in another file
  // used when you want to be exhaustive in your type hierachy

}
