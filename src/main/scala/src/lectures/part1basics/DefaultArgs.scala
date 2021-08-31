package src.lectures.part1basics

/**
  * Created by LENOVO on 23-08-2021.
  */
object DefaultArgs extends App{
  def trFact(n: Int, acc: Int=1): Int =
    if(n<= 1) acc
    else trFact(n-1, n*acc)

  val fact10 = trFact(10,2)

 // def savePicture(format: String,width: Int =1920, height: Int =1090, Unit = println("saving picture"))
  //savePicture(width=600)

  /*
   1. pass in every leading argument
   2. name the arguments
   */
  //savePicture(height=600, width= 800, format="bmp")
}

