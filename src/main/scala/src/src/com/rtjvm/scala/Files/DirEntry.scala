package src.src.com.rtjvm.scala.Files

/**
  * Created by LENOVO on 28-08-2021.
  */
abstract class DirEntry(val parentPath: String, val name: String){

  def path : String = parentPath + Directory.SEPERATOR + name
}
