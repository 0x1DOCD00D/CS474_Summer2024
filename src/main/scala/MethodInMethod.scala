object MethodInMethod:
  def f(): Unit = {
    def g(): Unit = {
      println("g is called")
    }
    g()
  }
  def main(args: Array[String]): Unit = {
    MethodInMethod.f()
  }