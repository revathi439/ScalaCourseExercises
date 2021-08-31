package src.src.com.rtjvm.scala.filesystem

import src.src.com.rtjvm.scala.Files.Directory

/**
  * Created by LENOVO on 28-08-2021.
  */
class State(val root: Directory, val wd: Directory, val output: String) {

   def show: Unit= {
     println(output)
     print(State.SHELL_TOKEN)
   }
  def setMessage(message:String): State =
  State(root, wd, message)
}

object State{

  val SHELL_TOKEN = "$"

  def apply(root: Directory, wd: Directory, output: String = ""): State =
    new State(root, wd, output)

}