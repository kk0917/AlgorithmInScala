import scala.collection.mutable.ListBuffer

object MyApp extends App {
  val list = ListBuffer(3, 1, 5, 4, 2)
  for (i <- 0 until list.length) {
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
