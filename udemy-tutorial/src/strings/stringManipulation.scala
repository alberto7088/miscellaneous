package strings

object stringManipulation extends App{

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(4))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.toLowerCase.startsWith("hello"))
  println(str.replace(",", "-"))
  println(str.length)


  val aNumberString = "45"
  println(aNumberString)
  val aNumber = aNumberString.toInt
  println(aNumber)

  val name: String = "David"

  val age: Int = 12
  val greeting = s"Hello, my name is $name and I am ${age + 2} years old"

  println(greeting)
}
