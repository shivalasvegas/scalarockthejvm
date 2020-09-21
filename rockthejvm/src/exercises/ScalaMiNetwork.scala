package exercises

object ScalaMiNetwork extends App {

  var scalaMi = Map("Jim" -> 0, "Daniel" -> 0, "Peter" -> 0, "Mary" -> 0, "Sophie" -> 0, "David" -> 0, "Harry" -> 0).withDefaultValue(-1)
  def addMi(name: String, friends: Int): Map[String, Int] = {
    scalaMi += name -> friends
    return scalaMi
  }
  def deleteMi(name: String): Map[String, Int] = {
    scalaMi -= name
    return scalaMi
  }

  def friendMi(name: String, friends: Int): Map[String, Int] = {
    scalaMi -= name
    val newFriend = friends + 1
    scalaMi += name -> newFriend
    return scalaMi
  }
  println(scalaMi)
  scalaMi = addMi("Frank", 0)
  println(scalaMi)
  scalaMi = deleteMi("Jim")
  println(scalaMi)
  scalaMi = friendMi("Frank", 0)
  println(scalaMi)


}

/*

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

