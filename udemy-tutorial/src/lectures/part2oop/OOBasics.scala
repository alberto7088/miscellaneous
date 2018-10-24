package lectures.part2oop

object OOBasics extends App{
  /*
  val person = new Person("Alberto", 29)
  println(person.x)
  person.greet("Giovanni")

  val person2 = new Writer("Alberto", "Citron", 29)
  println(person2.fullName())

  val novel = new Novel("The Book", 1989, person2)
  println(novel.isWrittenBy(person2))
  */
  val counter = new Counter(0)
  counter.inc(5).print

}

//Constructor
class Person(name: String, val age: Int){
  //Class parameters are NOT FIELDS, to be so you need to
  //tp pass them as val or var

  //BODY of the class

  //The following is a field becasue is a val
  val x: Int = 2

  //Te following is a side effect and it will be printed when
  // the class is instantiated, because the body will be evaluated.
  println(1 + 3)

  //Method
  def greet(name: String): Unit = println(s"${this.name} says: $name ")

  //The following is overloading
  def greet(): Unit = println(s"Hi I am $name")
  //def greet(): Int = 42 //same name different return type. The compiler won't know which one to execute
}

class Writer(firstName: String, surname: String, val age: Int){

  def fullName(): Unit = println(s"${this.firstName} ${this.surname}")
}

class Novel(name: String, releaseYear: Int, author: Writer){

  def authorAge(): Int = releaseYear - author.age

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int){
  def inc = {
    println("incrementing")
    new Counter(count + 1) // immutability
  }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }
  //Overloading
  def inc(n: Int): Counter = {
    if(n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter ={
    if(n <= 0) this
    else dec.dec(n-1)
  }

  def print = println(count)
}
