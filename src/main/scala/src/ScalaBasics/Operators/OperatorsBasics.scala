package src.ScalaBasics.Operators

/**
  * Created by LENOVO on 25-08-2021.
  */
object OperatorsBasics extends App {

  var a= 10;
  var b= 3;
  var c=true;
  var d= false;
  var result=0;
  println("addition is:"+(a+b));
  println("sub"+(a-b));
  if(a==b)
    println("output true");
  else
    println("output false");
  println("loical OR: "+(c||d));
  result = a&b;
  println("Bitwise AND :"+result);
  println("Addition Assignment operator"+(a+=b))



}
