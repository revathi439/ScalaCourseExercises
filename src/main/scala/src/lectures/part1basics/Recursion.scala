package src.lectures.part1basics

import scala.annotation.tailrec

/**
  * Created by LENOVO on 23-08-2021.
  */
object Recursion extends App {
  def factorial(n:Int): Int =
    if(n<=1) 1
    else {
      println("computing factorial of "+n+" - I first need factorial of"+(n-1))
    val result = n * factorial(n-1)
      println("computed factorial of"+n)
      result
    }
println(factorial(10))
  def anotherFactorial(n: BigInt): BigInt = {
    @tailrec
    def factHelper(x: BigInt, accumulator: BigInt):BigInt =
      if(x<=1) accumulator
      else factHelper(x-1 ,  x * accumulator)// TAIL RECURSION= use recursion call as the LAST expression
      (factHelper(n,1))

  }
  println(anotherFactorial(5000))
  // when you need loops, use_tail_recursion
  /*
  1. COncatenate a string n times
  2. IsPrime function tail recursion
  3. Fibnocci function, tail recursive.
   */
  def concatenateTailrec(aString: String, n:Int, accumulator: String):String =
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n-1, aString+accumulator)
      println(concatenateTailrec("hello", 3,""))

  def isPrime(n: Int):Boolean = {
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    isPrimeTailrec(n / 2, true)

  }
  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n: Int): Int ={
    def fiboTailrec(i: Int, last:Int, nextToLast: Int): Int =
      if(i>=n) last
      else fiboTailrec(i+1, last + nextToLast, last)
    if (n<= 2) 1
    else fiboTailrec(2,1,1)
  }
  println(fibonacci(8))
}
