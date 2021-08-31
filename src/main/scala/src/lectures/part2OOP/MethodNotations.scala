package src.lectures.part2OOP

/**
  * Created by LENOVO on 24-08-2021.
  */
object MethodNotations extends App{

  class Person(val name:String, favoriteMovie: String,  val age: Int =0){
    def likes(movie:String):Boolean = movie == favoriteMovie
    def +(person: Person):String = s"${this.name} is hanging out with${person.name}"
   def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)

    def unary_! : String = s"$name , what the heck?!"
    def unary_+ : Person = new Person (name, favoriteMovie, age+1)
    def isAlive : Boolean = true
    def apply() : String = s" hi, my name is $name, and I like $favoriteMovie"
    def apply(n: Int) : String = s" $name and I like $favoriteMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
      def learnsScala = this learns "Scala"
  }
val mary = new Person ("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")// equivalent
  // infix notation = operator notation (syntactic sugar)
 // "operators in scala
  val tom =new Person("Tom","Fight club")
  println(mary + tom)
  println(mary.+(tom))
  println(1+2)
  println(1.+(2))

  // all operators are methods
  //Akka Actors have !?

  //prefix notation(all about unary operator)
  val x = -1// equivalent with 1.unary
  val y= 1.unary_-
  // unary_prefix only works with -+!~

  println(!mary)
  println(mary.unary_!)
// postfix notation (method without parameters
  println(mary.isAlive)
  println(mary isAlive)

//apply

println(mary.apply())
  println(mary())//equivalent

  /*
  1. Overload the +operator
   mary +" the rockstar" => new person "Mary the rockstar)"

  2. Add an age  to the Person class
  Add a unary + operator => new Person with the age +1

  3. Add a "learns" method in the Person class => "Mary learns scala"
   Add a learnsScala method, calls learns methos with "Scala".
   Use it in postfix notation

   4. overload the apply method
    mary.apply(2) =>"Mary watched Inception 2 times"



   */
  println((mary + "the rockstar").apply())
  println((+mary).age)
    println(mary learnsScala)
      println(mary(10))
}
