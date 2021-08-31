package src.src.com.rtjvm.scala.filesystem

import java.util.Scanner

import src.src.com.rtjvm.scala.Files.Directory
import src.src.com.rtjvm.scala.commands.Command

/**
  * Created by LENOVO on 28-08-2021.
  */
object Filesystem extends App {

  val root = Directory.ROOT
  var state = State(root, root)
  val scanner = new Scanner(System.in)

  while (true) {
    state.show
    val input =scanner.nextLine()
    state = Command.from(input).apply(state)
   // println(scanner.nextLine())
  }
}

