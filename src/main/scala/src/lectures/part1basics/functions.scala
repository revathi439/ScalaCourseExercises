package src.lectures.part1basics

/**
  * Created by LENOVO on 23-08-2021.
  */
object functions extends App{

  def aFunction(a: String, b: Int): String ={
    a + " " +b
  }
  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello",3))

  // WHEN YOU NEED LOOPS, USE RECURSION.
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  def aBigFunction(n: Int): Int= {
  def aSmallerFunction(a: Int, b: Int): Int = a + b

  aSmallerFunction(n,n-1)
  }


   //1.A greeting function (name, age)=> "Hi , my name ia revathi and  I am twenty one years old"
 // 2. Fibnocci
 // 3. fatorial

   def greetingForKids(name: String, age: Int): String =
   "Hi i am"+ name+ "and i am"+age+ "years old."
  println(greetingForKids("revathi", 21))

  def factorial(n: Int): Int =
    if (n<=0) 1
    else n * factorial(n-1)
  println(factorial(5))// 120

  def fibonacci(n: Int): Int =
    if(n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

  def isPrime(n: Int):Boolean = {
    def isPrimeUntill(t: Int):Boolean =
      if(t<= 1) true
      else n%t!=0 && isPrimeUntill(t-1)
    isPrimeUntill(n/2)
  }
println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37*17))
}
