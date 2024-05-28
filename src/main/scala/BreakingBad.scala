object BreakingBad:
  lazy val x = () => {
    val x = 2
    println(s"block 1 - val of x is $x")
  }
  val y = x()
  val z = x()
  class BreakingVeryBad extends Exception
  def break = throw new BreakingVeryBad
  def marksIf(condition: => Boolean)(code: Any): Any =
    if condition then code else println("nothing")

 /* def breakable(code: => Any) =
    try {
      code
    } catch
      case BreakingVeryBad => println("caught")
      case _ => println("uncaught")*/

  @main def BreakBad() =
    val y = 3
    println("exceptions and all")
    x()
    marksIf(y == 5){
      println("equal")
    }