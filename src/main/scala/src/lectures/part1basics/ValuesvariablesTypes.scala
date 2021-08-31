package src.lectures.part1basics

/**
  * Created by LENOVO on 23-08-2021.
  */
object ValuesvariablesTypes extends App{
   val x: Int = 42
  println(x)
  val y: Int = 121
  println(y)
  // Vals are immutable( can;'t be reassigned)
  // Type of values are
  //compiler can infer types
  val aString: String ="Hello";
  println(aString)
  val anotherString="good bye"
  val aBoolean:Boolean = false
  val aChar: Char ='a'
  val anInt: Int = x
  val aShort: Short =4563
  val aLong: Long = 245466634345643L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14


  // VARIABLES
  var aVariable: Int = 4
  aVariable = 5
  println(aVariable)
}
