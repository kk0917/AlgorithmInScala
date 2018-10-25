import scala.collection.mutable.ListBuffer

object BubbleSort extends App {
  var list      = ListBuffer(3, 1, 5, 4, 2)
  var listCount = 1
  while (listCount < list.length) {
    for (i <- (list.length - listCount) to 0) {
      if (list(i) < list(i - 1)) {
        val tmp = list(i - 1)
        list(i - 1) = list(i)
        list(i) = tmp
      }
    }
    listCount += 1
    println(list)
  }
}