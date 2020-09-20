package lectures.part2oopbasics

object AbstractDataTypes extends App{
  // abstract class cannot be instantiated
  // methods and vals/vars are not initialised with values
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "canine"

    override def eat: Unit = println("crunch crunch")
  }

  trait Carnivore{
    def eat(animal: Animal):Unit
    // non abstract member
    val preferredMeal: String = "fresh meat"
  }

  class Crocodile extends Animal with Carnivore {
    val creatureType: String = "croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating  ${animal.creatureType}")
  }
  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // traits vs abstract classes
  // 1. Traits do not have constructor parameters
  // 2. you can only extend one class, but can inherit multiple traits
  // 3. Traits are behaviours, abstract classes are "things"

}
