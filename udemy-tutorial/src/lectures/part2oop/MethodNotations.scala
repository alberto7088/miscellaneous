package lectures.part2oop

object MethodNotations extends App{

  abstract class Animal {
    val N_EYES = 2
  }

  class SmallAnimal extends Animal{
    override val N_EYES = 3
  }

  val croc = new SmallAnimal
  println(croc.N_EYES)

  val anna = new Person("Anna", "Inception")
  println(anna.likes("Inception"))
  println(anna likes "Inception") //Equivalent to previous

  val jhon = new Person("Jhon", "Batman")
  println(anna.+(jhon))

  class Person(val name: String, favouriteMovie: String, val age: Int = 0){
    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favouriteMovie)
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def apply(): String = s"Hi, my name is $name I am $age years old. I like very much $favouriteMovie"
  }

  println(anna.+("The rockstar")())
  println((anna + "The rockstar")()) //Equivalent to the previous

  val alberto = new Person("Alberto", "Braveheart", 29)
  println((alberto.unary_+)())
  println((alberto + "the good")())
  println((+alberto).age)
}
