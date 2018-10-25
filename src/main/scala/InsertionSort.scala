import scala.collection.mutable.ListBuffer

object InsertionSort extends App {
  val list = ListBuffer(3, 1, 5, 4, 2)
  for (i <- list.indices) {
    val v = list(i)
    var j = i - 1
    println(j)

    while (j >= 0 && list(j) > v) {
      list(j + 1) = list(j)
      j -= 1
    }
    list(j + 1) = v
    println(list)
  }
}
