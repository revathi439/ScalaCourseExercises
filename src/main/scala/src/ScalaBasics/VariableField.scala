package src.ScalaBasics

/**
  * Created by LENOVO on 25-08-2021.
  */
object VariableField extends App{

  val Example = new disp()
  Example.windet()
}
class disp{
  var x = 10.3f
  var y= 7f
  def windet(): Unit =
            {
              println("output"+x)
            }
  println("output of"+y)
}
