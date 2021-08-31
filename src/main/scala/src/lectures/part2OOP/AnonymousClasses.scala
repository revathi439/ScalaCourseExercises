package src.lectures.part2OOP

/**
  * Created by LENOVO on 24-08-2021.
  */
object AnonymousClasses extends App{

  abstract class Animal{
    def eat: Unit
  }

  // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahahaha")
  }
//  println(funnyAnimal.getClass)
/*class AnonymousClasses$$anon$1 extends Animal{
  override def eat: Unit = println("ahahahahaha")
}
  val funnyAnimal: Animal = new AnonymousClasses$$anon$1
  */
  println(funnyAnimal.getClass)
  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my nam is $name, how can I help?")
  }
val jim = new Person("jim"){
  override def sayHi: Unit = println(s"Hi, my nam is jim, how can I service?")
}
  /*
  1.Generic trait Mypredicate[-T] with a little method test(T)=> Boolean
  2. Generic trait MyTransformer[A, B]
  3. MyList:
  - map(transformer)=> MyList
  -filter(predicate => MyList
  -flatMap(transformer from A to MyList[B] => MyList[B}

  class EvenPredicate extends MyPredicate[Int]
  class StringToTransformer extends MyTransformer[String, Int]

  [1,2,3].map(n*2)=[2,4,6]
  [1,2,3,4].filter(n%2)=[2,4]
  [1,2,3].flatMap(n=>[n,n+1) => [1,2,2,3,3,4]
 */
}
