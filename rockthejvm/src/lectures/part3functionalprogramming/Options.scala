package lectures.part3functionalprogramming

import scala.util.Random

object Options extends App{
  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  // unsafe APIs
  // Some() should always have a value
  def unsafeMethod(): String = null
  val result = Option(unsafeMethod())
  println(result)

  // Chained methods
  def backupMethod(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

  // Design unsafe APIs
  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A valid result")
  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()

  // Functions on options
  println(myFirstOption.isEmpty)
  println(myFirstOption.get)

  // map, flatmap, filter
  println(myFirstOption.map(_ * 2))
  println(myFirstOption.filter(x => x > 10))
  println(myFirstOption.flatMap(x => Option(x * 10)))

  // for comprehensions
  /*
  1. Try to establish connection  - print the connect method


   */

  val config: Map[String, String] = Map(
    "host" -> "176.45.36.1",
    "port" -> "80"
  )

  class Connection {
    def connect  = "Connected"

  }

  object Connection {
    val random = new Random(System.nanoTime())

    def apply(host: String, port: String): Option[Connection] =
      if (random.nextBoolean()) Some(new Connection)
      else None
  }

  val host  = config.get("host")
  val port = config.get("port")
  val connection = host.flatMap(h => port.flatMap(p => Connection.apply(h, p)))
  val connectionStatus = connection.map(c => c.connect)
  println(connectionStatus)
  connectionStatus.foreach(println)

}
