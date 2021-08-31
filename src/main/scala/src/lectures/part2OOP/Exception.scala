package src.lectures.part2OOP

import java.nio.BufferUnderflowException

/**
  * Created by LENOVO on 26-08-2021.
  */
object Exception extends App {

  val x: String = null
  //println(x.length)
  // this^^ will crash with a NPE
  //Throwing and catching exceptions

 // val aWeirdValue: String = throw new NullPointerException

  // throwable classes extend the Throwable class.
  // Exception and Error are the major Throwable subtype

  //2. how to catch exceptions

  def getInt(withException: Boolean): Int =
    if (withException)throw new RuntimeException("No int for you!")
    else 42

  val potentialFail = try{
    //code that might throw
    getInt(false)
  }
  catch{
    case e: RuntimeException => 43
  }
  finally{
    //code that will get exxecuted NO MATTER WHAT

    // optional
    // does not influence the return type of this expression
    println("finally")
  }
  println(potentialFail)
  //3. how to define your own exception
  class MyException extends Exception
  val exception = new Exception

  //throw exception

  /*
  1. crash your program with an OutOfMemoryError
  2. Crash with SoError
  3.PocketCalculator
  -add(x,y)
  - multiply(x,y)
  -subtract(x,y)
  -divide(x,y)

  Throw
  - overflowException if add(x,y) exceeds Int.MAX_VALUE
  - underflowException if subtract(x,y) exceeds Int.MIN_VALUE
  - MathCalculationException for division by 0
   */

  // OOM
  //val array = Array.ofDim(Int.MaxValue)

  // SO
 // def infinite: Int = 1+infinite
  //val noLimit = infinite
  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Division by zero")
  object PocketCalculator{
    def add(x: Int, y: Int)= {
      val result = x+y
      if(x>0 && y>0 && result< 0) throw new OverflowException
      else if (x<0 && y<0 && result >0) throw new BufferUnderflowException
      else result
    }
    def subtract(x: Int, y: Int) ={
      val result = x-y
      if(x>0 && y<0 && result <0) throw new OverflowException
      else if (x<0 && y<0 && result>0) throw new UnderflowException
      else result

    }
    def multiply(x: Int, y:Int)={
      val result = x*y
      if(x>0 && y>0 && result <0) throw new OverflowException
      else if(x<0 && y<0 && result <0) throw new OverflowException
      else if(x>0 && y<0 && result >0) throw new UnderflowException
      else if(x<0 && y>0 && result >0) throw new UnderflowException
    }

    def divide(x: Int, y: Int) ={
      if(y==0) throw new MathCalculationException
      else x/y
    }
  }
 println(PocketCalculator.add(Int.MaxValue,10))
  println(PocketCalculator.divide(2,0))
}
