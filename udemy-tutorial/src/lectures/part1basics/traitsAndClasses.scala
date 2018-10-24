package lectures.part1basics

import scala.language.postfixOps

object traitsAndClasses extends App {

  trait Pet {
    def name: String
    def saying(): Unit = {println("ah ah ah ah")}
  }

  trait Greeting {
    def animalSaying(): Unit
  }

  class Cat(val name: String) extends Pet with Greeting {
    override def animalSaying(): Unit = {println("Hello I am a king of cat")}
  }
  class Dog(val name: String) extends Pet with Greeting {
    override def animalSaying(): Unit = {println("Hello I am a king of dog")
    }
  }

  val dog = new Dog("Scott")
  val cat = new Cat("Adolf")

  println(dog name)
  println(dog saying())
  println(dog animalSaying())
  println(cat name)
  println(cat animalSaying())
}
