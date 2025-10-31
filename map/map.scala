object Main {
  def main(args :Array[String]) = {
    println (123123123)

    var mapV = Map(1 -> "name", 2 -> "lll")

    for ((id, name) <- mapV ) {
//      println (s"$id, $name")
      println( (id, name))
    }

    var b = Map(2 -> "a")
    for ((id, name) <- b) {
      println((id, name))
    }

  }
}