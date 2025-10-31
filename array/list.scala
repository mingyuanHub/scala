object HelloWorld {
    def main(args: Array[String]) = {
        println(111)

        var list = Array(1,3)

        for (x <- list) {
            println(x)
        }
    }
}