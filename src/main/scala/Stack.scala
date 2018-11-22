import scala.collection.mutable.ListBuffer

object Stack extends App {

  var S = ListBuffer()
  var top = 0

  def initialize(): Unit = top = 0

  def isEmpty: Boolean = top == 0

  def isFull: Boolean = top >= (S.length - 1)

  def push(x: Int) = if (isFull) 99999 else {top += 1; S :+ x}

  def pop() = if (isEmpty) 99999 else top -= 1; S(top + 1)
}
