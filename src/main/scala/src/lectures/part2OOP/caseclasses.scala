package src.lectures.part2OOP

/**
  * Created by LENOVO on 26-08-2021.
  */
object caseclasses extends App{

    /*
    equals, hashcode, toString
     */
    case class Person(name: String, age: Int)

    // 1.class parameters are fields
    val jim = new Person("Jim", 34)
    println(jim.name)

    // 2.sensible toString
    //println(instance)= println(instance.toString)// syntactic sugar
    println(jim )

    // 3. equals and hashcode implemented OOtb

    val jim2 = new Person("Jim", 34)
    println(jim == jim2)

    // 4. case classed have handy copy methods

    val jim3 = jim.copy(age=45)
    println(jim3)

    // 5. ccs have companion objects
    val thePerson = Person
    val mary = Person("Mary", 23)

    // 6. ccs are serializable
    //Akka
    // 7. CCS have extractor patterns =CCs can be used in PATTERN MATCHING

    case object UnitedKingdom{
      def name: String =" The UK of GB nd NI"

    }

    /*
    expand MyList
     */



}
