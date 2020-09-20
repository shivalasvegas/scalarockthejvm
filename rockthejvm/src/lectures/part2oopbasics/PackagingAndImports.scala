package lectures.part2oopbasics

import java.util.Date
import java.util.{Date=>SqlDate}
import playground.{PrinceCharming, Cinderella=>Princess}

object PackagingAndImports extends App{

  // package members are accesssible byt their simple name
  val writer = new Writer("Shiva", "King", 42)

  // import the package
  val princess = new playground.Cinderella
  val princess2 = new Princess
 val prince = new PrinceCharming


  // packages are in a hierachy
  // matching folder structure

  // Package Object
  // right click on package and create a new package object
  // package objects can only be one object
  sayHello
  println(SPEED_OF_LIGHT)

  //1. use Fully Qualified  names
  val date = new Date
  //2. Aliasing
  val sqlDate = new SqlDate(2018, 5, 4)

  //Default imports
  //java.lang - String Object Exception

  // scala - Int, Nothing
  // Scala Pre Dev


}
