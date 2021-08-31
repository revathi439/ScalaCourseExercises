package src.ScalaBasics

/**
  * Created by LENOVO on 25-08-2021.
  */
object Loops extends App {

  var y =0
  for(y<-13 to 45)
    {
      println("value of y is: "+y)
    }
  var a=2
  while (a<=4)
    {
      println("print: "+a);
      println("Scala")
      a=a+1
    }
  var b = 15;
  do {
    print(b+" ")
    b=b-1;

  }
  while(b>0)

  // nested while loop
  var d=5;
  var e=0;
  while(d<7)
    {
      e=0;
      while(e<7)
        {
          println("print: "+d, "e =" +e)
          e=e+1;
        }
      println()
      d=d+1;
      println("value of a become: "+d)
      println()
    }
}
