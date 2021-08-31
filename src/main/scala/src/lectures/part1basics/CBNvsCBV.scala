package src.lectures.part1basics

/**
  * Created by LENOVO on 23-08-2021.
  */
object CBNvsCBV extends App{
   def calledByValue(x: Long): Unit ={
     println("by value:"+34658767898976878L)
     println("by value:"+55346676858676578L)
   }
def calledByName(x: => Long): Unit = {
  println("by value:"+System.nanoTime())
  println("by value:"+System.nanoTime())

}
  calledByValue(325345645786789789L)
  calledByName(System.nanoTime())

  def infinite(): Int = 1 +infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(),34)
  printFirst(34, infinite())

}
