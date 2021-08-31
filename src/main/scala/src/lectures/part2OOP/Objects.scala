package src.lectures.part2OOP

/**
  * Created by LENOVO on 24-08-2021.
  */
object Objects extends App {
// scala does not have class level functonality ("static")
  object Person{// type +its only instance
    // "static /" class" - level functionality
  val N_EYES = 2
  def canFly: Boolean = false
  //factory method
  def apply(mother: Person,father: Person) = new Person("Bobbie")
}
  class Person(val name: String){
    // instance - level functionaliity
  }
  // COMPANIONS
  println (Person.N_EYES)
  println (Person.canFly)
  // Scala objects = SINGLE INSTANCE
  val mary = new Person ("mary")
  val john = new Person ("johhn")
  println (mary == john)

  val person1 = Person
  val person2 = Person
  println (person1 == person2)
  val bobbie = Person (mary, john)
  // scala applications= scala object with
  // def main(args: Args[String]): Unit
}
