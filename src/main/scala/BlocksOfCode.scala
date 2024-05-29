object BlocksOfCode:
  lazy val x = {
    println("Strict eval of x")
  }
  def fBlockTake(codeBlock: => Int) =
    //codeBlock
    println("codeblock")

  def IFF(cond: => Boolean, thenCode: => Unit, elseCode: => Unit) =
    if cond then elseCode else thenCode

  def f(i:Int) =//strict evaluation
    val j = 2
    println(i)


  @main def runBlockofCode =
    //f(2+3)
    //x
    IFF(2>3, println("false"), println(true))
    fBlockTake {
      val y = 3
      val z = 5
      println(y+z)
      y+z
    }