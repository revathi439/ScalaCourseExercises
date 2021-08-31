package src.lectures.Part3FP

/*package lectures.Part3FP

*
  * Created by LENOVO on 26-08-2021.
  */
object AnonymousFunctions extends App{
  // anonymous function (LAMBDA)
  val doubler = (x: Int) => x * 2

  // multiple parameters in LAMBDA
  val adder: (Int,Int) => Int = (a: Int, b:Int) => a + b

  //no parameters
  val justDoSomething: () => Int = () => 3

  //careful
  println(justDoSomething) //function itself
  println(justDoSomething()) //call

  //curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

  //MOAR syntactic sugar
  val niceIncrementer: Int => Int = _ + 1 //equivalent to x => x + 1
  val niceAdder: (Int,Int) => Int = _ + _ // equivalent to (a,b) => a + b

  /*
      1. MyList: replace all FunctionX calls with lambdas
      2. Rewrite the "special" adder as an anonymous function
   */

  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))



}

