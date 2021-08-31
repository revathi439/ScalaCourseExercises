package src.lectures.part1basics

/**
  * Created by LENOVO on 23-08-2021.
  */
object Expressions extends App {
   val x = 1+2 // Expression
  println(x)
  println(2+3*4)
  //  math operators are + - * / << >> >>> (right shift with zero extension)
  println( 1 == x)
  // == != > >= < <=
  println(!(1== x))
  // ! && ||
  var aVariable = 2
  aVariable += 3// also work with -= *= /=....side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // If expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3// If Expression
  println(aConditionValue)
  println(if(aCondition) 5 else 3)
  println(1+3)

  var i = 0
  while(i< 10) {
    println(i)
    i+= 1
  }
  // NEVER write this again
  // everything in scala is an expression!
  val aWeirdValue = {aVariable = 3}// Unit == void
  println(aWeirdValue)
// side effects : println() , whiles, reassigning
  // code blocks
   val aCodeBlock = {
  val y=2
  val z= y+1
   if (z>2) "hello" else "goodbye"
  // 1. Difference between "hello world' vs println("hello world")?
  // 2.
  val someValue = {
    2 < 3
  }
    println(someValue)

  val someOtherValue ={
    if(someValue) 239 else 980
    42
  }
  println(someOtherValue)
}

}
