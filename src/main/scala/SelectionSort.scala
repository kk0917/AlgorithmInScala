import scala.collection.mutable.ListBuffer

object SelectionSort extends App {
  var list         = ListBuffer(3, 1, 5, 4, 2)
  var replaceCount = 0
  for (i <- 0 until list.length) {
    var minj = i
    for (j <- i until list.length) {
      if (list(j) < list(minj)) {
        minj = j
      }
    }

    val swap = list(minj)
    list(minj) = list(i)
    list(i) = swap
    replaceCount += 1

    println(list)
    println(replaceCount)
  }
}