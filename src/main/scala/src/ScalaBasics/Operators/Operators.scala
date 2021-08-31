package src.ScalaBasics.Operators

/**
  * Created by LENOVO on 25-08-2021.
  */
object Operators extends App{

  var x = 30;
  var y = 20;
  // ARTHIMETIC

  // Addition
  println("Add: " + (x + y));
  // Subtraction
  println("sub: " + (x - y));
  // Multiplication
  println("Mul: " + (x * y));
  // Division
  println("Division: " + (x / y));
  //Modulus
  println("Modulus: " + (x % y));
  // Equal to operator
  println("Equality  : " + (x == y));

  // Not equal  operator
  println("Not Equal : " + (x != y));

  // Greater than operator
  println("Greater than : " + (x > y));

  // Lesser than operator
  println("Lesser than  : " + (x < y));

  // Greater than equal to operator
  println("Greater than or Equal to is : " + (x >= y));

  // Lesser than equal to operator
  println("Lesser than or Equal to is : " + (x <= y));
//LOGICAL
  var a= false
  var b= true
  println("Logical NOt = "+ !(a&&b));
  println("Logical OR= "+ (a||b));
  println("Logical AND "+(a&&b));


  // ASSIGNMENT OPERATORS
  var d = 50;
  var  e= 40;
  var f= 0;

  // simple addition
  f = d + e;
  println("simple addition:  = " + f);

  // Add AND assignment
  f += d;
  println("Add and assignment = " + f);
  f-=d
  // Subtract AND assignment
  println("Subtract and assignment o = " + f);

  // Multiply AND assignment
  f*=d
  println("Multiplication and assignment  " + f);

  // Divide AND assignment
  f/=d
  println("Division and assignment  " + (f));

  // Modulus AND assignment
  f%=d
  println("Modulus and assignment of  " + f);

  // Left shift AND assignment
  f<<=3
  println("Left shift and assignment  = " + (f));

  // Right shift AND assignment
  f>>=3
  println("Right shift and assignment  = " + (f));

  // Bitwise AND assignment
  f &=d
  println("Bitwise And assignment  = " + (f));

  // Bitwise exclusive OR and assignment
  f^=d
  println("Bitwise Xor and assignment of c ^= a = " + (f));

  // Bitwise inclusive OR and assignment
  f|=d
  println("Bitwise Or and assignment of c |= a = " + (f));


}
