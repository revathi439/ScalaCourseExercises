package src.lectures.part1basics

/**
  * Created by LENOVO on 23-08-2021.
  */
object StringOps extends App{

  val str: String ="Hello, I am learning scala"
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // scala- specific: string interpolators
  // s-- nterpolators
  val name= "revathi"
  val age=12
  val greeting = s"Hello, my name is $name and $age years old"
  val anotherGreeting = s"Hello, my name is $name ana I Will be turning ${age+1} years old"
  println(anotherGreeting)

  // F- interpolators
  val speed =1.2f
  //val name = "anjali"
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)
  //raw interpolators
  println(raw"This is a \n newline")
  val escaped ="This is a \n newline"
  println(escaped)
}
