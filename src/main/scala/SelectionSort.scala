import scala.collection.mutable.ListBuffer

object SelectionSort extends App {
  var list         = ListBuffer(3, 1, 5, 4, 2)
  var replaceCount = 0
  for (i <- list.indices) {
    var minj = i
    for (j <- i until list.length) {
      if (list(j) < list(minj)) {
        minj = j
      }
    }

    val tmp = list(minj)
    list(minj) = list(i)
    list(i) = tmp
    replaceCount += 1

    println(list)
    println(replaceCount)
  }
}