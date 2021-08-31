package src.lectures.part2OOP

/**
  * Created by LENOVO on 23-08-2021.
  */
object OOBasics extends App{

  val person = new Person("john", 23)
  println(person.x)
  person.greet("Daniel")
  person.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  //val counter = new Counter
  //counter.inc.print
  //counter.inc.inc.inc.print
  //counter.inc(10).print

}
//constructor
class Person(name: String , val age: Int){
  //body
  val x = 2
  println(1+3)
// method
  def greet(name:String): Unit = println(s"${this.name} says: Hi, $name")

  def greet(): Unit = println(s"Hi, i am $name")
  // multiple condtructor
  def this(name: String)= this(name, 0)
  def this() = this("Jhon Doe")
}
/*
Novel and a Writer
Writer:First name, surname, year
- method fullname
novel:name, year of release, author
-authortype
-isWrittenBy(author)
-copy (new year of release)= new instance of Novel

 */
class Writer(firstName: String, surName: String, val year: Int){
  def fullName: String = firstName +" "+ surName
}
class Novel(name: String, year:Int, author:Writer){
  def authorAge = year-author.year
  def isWrittenBy(author: Writer)= author == this.author
  def copy(newYear:Int):Novel = new Novel(name, newYear, author)
}
/*
counter class
-receive an int value
-method current count
- method to increment/dcrement=> new counter
-overload inc/dec to receive an amount
 */
class Counter(val count:Int=0){
 def inc = {
  println("incrementing")
new Counter (count+1)// immutability
}

 def dec = {
  println("decrementing")
new Counter(count - 1)
}

  def inc(n: Int):Counter = {
  if(n<= 0) this
  else inc.inc(n-1)
}
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)

    //def print = println()
  }

  }
// class parameters are NOT FIELDS