package lectures.part2oopbasics

object Generics extends App{
  // A => generic type
  // covariant
  class MyList[+A]{
    // use type A
    def add[B >: A](element: B): MyList[B] = ???
    // A = Cat
    // B = Animal
    //
  }
  class MyMap[Key, Value]
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //Generic Methods

  object MyList {
    def empty[A]: MyList[A] = ???

  }
  val emptyListOfIntegers = MyList.empty[Int]

  // vairance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //1. List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]{

  }
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  //animalList.add(New Dog) ??? Hard question => we return a list of animals
  //2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //3. Hell No! CONTRAVRAIANCE opposite to COVARIANCE
  class ContravariantList[-A]
  class Trainer[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded Types
  // only accepts sub classes of Animal
  // Upper bounded >: super class of Animal
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  // Expand MyList to be generic
}
