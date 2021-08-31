package src.src.com.rtjvm.scala.commands

import src.src.com.rtjvm.scala.filesystem.State

/**
  * Created by LENOVO on 28-08-2021.
  */
class UnknownCommand extends Command{

  override def apply(state: State ):State =
   state.setMessage("Command not found")
}
