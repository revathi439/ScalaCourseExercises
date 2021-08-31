package src.lectures.Part3FP

import scala.util.Random

/**
  * Created by LENOVO on 27-08-2021.
  */
object Options extends App {

  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  println(myFirstOption)

  // unsafe APIs
  def unsafeMethod(): String = null

  //val result = Some(unsafeMethod()) // WRONG
  val result = Option(unsafeMethod()) // Some or None
  println(result)

  // Chained methods
  def backupMethod(): String = " A valid result"

  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

  // DESIGN unsafe APIs
  def betterUnsafeMethod(): Option[String] = None

  def betterBackupMethod(): Option[String] = Some("A valid result")

  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()


  // functions on options
  println(myFirstOption.isEmpty)
  println(myFirstOption.get) // USAFE -DO NOT USE THIS


  // map, flatMap, filter
  println(myFirstOption.map(_ * 2))
  println(myFirstOption.filter(x => x > 10))
  println(myFirstOption.flatMap(x => Option(x * 10)))

  //for- comprehension

  /*

  Exercise
   */
  val config: Map[String, String] = Map {
    // fetched from elsewhere
    "host" -> "176.45.36.1"
    "port" -> "80"
  }

  class Connection {
    def connect = "Connected" //connect to some server
  }

  object Connection {
    val random = new Random(System.nanoTime())

    def apply(host: String, port: String): Option[Connection] =
      if (random.nextBoolean()) Some(new Connection)
      else None

  }

  // try to establish a connection, if so - print the connect method
  val host = config.get("host")
  val port = config.get("port")

  /*
  If (h! = null)
  if(p!= null)
  returnConnection.apply(h,p)
  return null
   */
  val connection = host.flatMap(h => port.flatMap(p => Connection.apply(h, p)))
  /*
if(c!= null)
return c.connect
return null
 */
  val connectionStatus = connection.map(c => c.connect)
  // if(connectionStatus == null) println(None) else print(Some(Connections.get))

  println(connectionStatus)
  connectionStatus.foreach(println)

/*//chained calls
  config.get("host")
         .flatMap(host => config.get("port"))
            .flatMap(port => connection(host,port))
            .map(connection => connection.connect))
         . foreach(println)


// for- consequencesions
  val forConnectionStatus = for{
  host <- config.get("host")
  port <-config.get("port")
  connection <- Connection(host, port)
  }yield connection.connect
  forConnectionStatus.foreach(println))
  */

}
