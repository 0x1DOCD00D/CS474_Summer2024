object BreakingBad {
  class BreakException extends Exception
  def `I want to break this damn thing because I am an evil programmer` = throw new BreakException
  def breakable(codeBlock: => Unit) =
    try {
      codeBlock
    }
    catch {
      case e: BreakException => println("hehehe")
      case _ => println("too bad")
    }


  @main def BreakBad =
    breakable {
      val a = 1
      println(a)
      `I want to break this damn thing because I am an evil programmer`;
      println(a+1)
    }

}