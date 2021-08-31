package src.ScalaBasics

/**
  * Created by LENOVO on 25-08-2021.
  */
object VariablesLocal extends App{

  val ex =new Area()
  ex.mult()

}
class Area
{
  def mult(): Unit =
  {
    var(a,b)=(3,80);
    var c=a*b;
    println("area is:"+c)
  }
}
