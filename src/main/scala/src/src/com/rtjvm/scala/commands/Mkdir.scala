package src.src.com.rtjvm.scala.commands

import src.src.com.rtjvm.scala.Files.{DirEntry, Directory}
import src.src.com.rtjvm.scala.filesystem.State

/**
  * Created by LENOVO on 28-08-2021.
  */
class Mkdir(name: String) extends Command {

  override def apply(state: State): State = {
    val wd = state.wd
    if (wd.hasEntry(name)) {
      state.setMessage("Entry" + name + "already exist!")
    } else if (name.contains(Directory.SEPERATOR)) {
      state.setMessage(name + " must not contain separator")
    } else if (checkillegal(name)) {
      state.setMessage(name + ": illegal entry name!")
    }else {
      doMkdir(state, name)
    }
  }

    def checkillegal(name : String): Boolean ={
      name.contains(".")

   }
  def doMkdir(state: State, name: String):State = {

    def updateStructure(currentDirectory: Directory, path: List[String], newEntry: DirEntry): Directory= ???

    val wd = state.wd
    val fullPath = wd.path
    // 1.all the directories in the full path
      val allDirsInPath = wd.getAllFoldersInPath
    // 2. create new directory entry in the wd
      val newDir = Directory.empty(wd.path, name)
    // 3.update the whole directory structure starting from the root

    // (the directory structure is immutable)
    val newRoot = updateStructure(state.root, allDirsInPath, newDir)
    // 4. find new working directory INSTANCE given wd's full path, in the NEW directory structure
    val newWd = newRoot.findDescendant(allDirsInPath)

    State(newRoot, newWd )
  }
}