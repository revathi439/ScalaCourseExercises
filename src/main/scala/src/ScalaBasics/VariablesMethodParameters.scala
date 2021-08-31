package src.ScalaBasics

/**
  * Created by LENOVO on 25-08-2021.
  */
object VariablesMethodParameters extends App{

  val some =new rect()
  some.mult(5,10)
}
class rect{
  def mult(a:Int, b:Int): Unit =
  {
    var result= a*b
    println("Area is"+result);
  }
}

