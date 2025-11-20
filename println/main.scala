// SimpleFix.scala
object SimpleFix {
  def main(args: Array[String]): Unit = {
    // 最简单的方法：使用 GBK 编码输出
    def printGBK(text: String): Unit = {
      try {
        val bytes = text.getBytes("GBK")
        System.out.write(bytes, 0, bytes.length)
        System.out.write('\n')
        System.out.flush()
      } catch {
        case e: Exception =>
          System.out.println("输出失败: " + e.getMessage)
      }
    }

    printGBK("中文测试 - 使用GBK编码")
    printGBK("这样可以正常显示中文")
    printGBK("Hello 世界")
  }
}