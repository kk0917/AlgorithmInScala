import scala.collection.mutable.ListBuffer

object BubbleSort extends App {
  var list      = ListBuffer(3, 1, 5, 4, 2)
  var listCount = 1
  while (listCount < list.length) {
    for (j <- (list.length - listCount) to 0) {
      if (list(j) < list(j - 1)) {
        val temp = list(j - 1)
        list(j - 1) = list(j)
        list(j) = temp
      }
    }
    listCount += 1
    println(list)
  }
}