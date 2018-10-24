package exercises

abstract class MyListTwo {
  def head : Int
  def tail : MyListTwo
  def isEmpty: Boolean
  def add(element: Int): MyListTwo
  def printElement: String
  override def toString : String = "[" + printElement + "]"
}

object EmptyTwo extends MyListTwo {
  def head : Int = throw new NoSuchElementException
  def tail : MyListTwo = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(element: Int): MyListTwo = new ConsTwo(element, EmptyTwo)
  def printElement: String = ""
}

class ConsTwo(h: Int, t: MyListTwo) extends MyListTwo {
  def head : Int = h
  def tail : MyListTwo = t
  def isEmpty : Boolean = false
  def add(element: Int) : MyListTwo = new ConsTwo(element, this)
  def printElement: String = {
    if(t.isEmpty) "" + h
    else h + ", " + t.printElement
  }
}

object ListTestTwo extends App {
  val list = new ConsTwo(1, new ConsTwo(2, new ConsTwo(3, EmptyTwo)))
  println(list.toString)
}

