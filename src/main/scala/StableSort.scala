import scala.collection.mutable.ListBuffer

object StableSort extends App {

  // Bubble Sort
  var cards = ListBuffer("H4", "C9", "S4", "D2", "C3")
  for (i <- cards.indices) {
    for (j <- (cards.length - 1) until i by -1) {
      if (cards(j).charAt(1) < cards(j - 1).charAt(1)) {
        val tmp = cards(j - 1)
        cards(j - 1) = cards(j)
        cards(j) = tmp
      }
    }
  }
  println(cards.mkString(" "))

  // Selection Sort
  var cards2 = ListBuffer("H4", "C9", "S4", "D2", "C3")
  for (i <- cards2.indices) {
    var min = i
    for (j <- i until cards.length) {
      if (cards2(j).charAt(1) < cards2(min).charAt(1)) {
        min = j
      }
    }
    var tmp = cards2(i)
    cards2(i) = cards2(min)
    cards2(min) = tmp
  }
  println(cards2.mkString(" "))
}
