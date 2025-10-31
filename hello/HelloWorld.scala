import  java.lang.String

object HelloWorld {
	def main(args: Array[String]) = {
		println("aaaa")

		val intValue: Int = 1111
		val stringValue: String = "adfadf"
		val listValue: List[Int] = List(1,2,3)
		val mapValue: Map[Int, String] = Map(1 -> "111",2 -> "222",3->"333")

		println(intValue)
		println(stringValue)
		println(listValue)
		println(mapValue)

		var intValue1 = 1
		val stringValue1 = "name"
		var listValue1 = List(333)
		println(intValue1)
		println(stringValue1)
		println(listValue1)

		intValue1 = intValue
		println(intValue1)

		listValue1 = listValue
		println(listValue1)

		var a = 3
		if (a < 4) {
			println("a<4")
		}

		def add(a : Int, b : Int) : Int = {
			return a + b
		}

		println(add(4,5))

		var res :Boolean = 2 > 1
		println(res)

		var res1 = "hello".indexOf("o")
		println(res1)

		println("hello".hashCode())
	}
}