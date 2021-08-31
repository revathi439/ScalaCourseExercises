package src.lectures.part2OOP

import java.util.Date
import java.sql.{Date => SqlDate}

import src.playground.{Cindrella => Princess,PrinceCharming}
/**
  * Created by LENOVO on 26-08-2021.
  */
object PackagingAndImports extends App {

  //package members are accessible by their simple name
  val writer = new Writer("Daniel","RockTheJVM", 2018 )

  // import the package
  val princess = new Princess // playground.Cindrella=fully qualified name
 // packages are in hierarchy
  // matching folder structure.

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  // imports
  val prince = new PrinceCharming
  //
  val date = new Date
  //val sqlDate = new SqlDate{2018, 5, 4}
    // 2. use aliasing

  // default imports
  // java.lang - String, object, Exception
  // scala- Int, Nothing, Function

}
