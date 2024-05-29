object BlocksOfCode:
  val x = () => {
    println("Strict or lazy eval of x")
    val y = 3+2
    y+4
  }

  val y = f
  def takeIt(): Int => Int = f

  class MyFunc extends (Int => Any):
    override def apply(v1: Int): Any = ???

  def fBlockTake(codeBlock: => Int) =
    codeBlock
    println("codeblock")

  def IFF(cond: => Boolean, thenCode: => Unit, elseCode: => Unit) =
    if cond then elseCode else thenCode

  def f(i:Int) =//strict evaluation
    val j = 2
    println(i)
    i


  @main def runBlockofCode =
    println("inside the main")
    fBlockTake {
      println("experiments with passing a block")
      val y = 2+3
      y+5
    }
//    println(takeIt()(10))
//    println(x())
//    println(x())
//    println(x())
//    println(y)
//    println(y(3) == f(3))
    //f(2+3)
    //x
//    IFF(2>3, println("false"), println(true))
//    fBlockTake {
//      val y = 3
//      val z = 5
//      println(y+z)
//      y+z
//    }