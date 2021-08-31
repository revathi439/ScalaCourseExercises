package src.lectures.part2OOP

/**
  * Created by LENOVO on 24-08-2021.
  */
object Inheritnce extends App{
  // singlr class Inheritance

  class Animal {
    val creatureType = "wild"
    def eat = println("nomnom")
  }
class Cat extends Animal{
   def crunch ={
     eat
     println("crunch crunch")
   }
}

  val Cat =new Cat
  Cat.crunch
  // constructors
  class Person(name:String, age : Int){
    def  this(name: String)= this(name, 0)
  }
  class Adult(name:String, age:Int, idCard : String) extends Person(name)
// overriding
  class Dog (override val creatureType : String)extends Animal{
  //override val creatureType = " domestic"
   override def eat = {
    super.eat
    println("crunch, crunch")

  }

}
val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substituion(broad: Polymorphism)
  val unknownAnimal:Animal = new Dog("K9")
  unknownAnimal.eat

  // overriding vs overloading
  //super
// preventing overrides
  // 1, -use keyword final on member
   // 2.- use final to entire class
  // 3. sea; the class - extend classes in this file, prevent extensions in other files
}
