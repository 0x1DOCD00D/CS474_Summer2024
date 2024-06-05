object AwayWithExceptions:
  trait Maybe[+T]
  case object Nothingness extends Maybe[Nothing]
  case class Something[T](d: T) extends Maybe[T]


  def func(p1: Float, p2:Float): Maybe[Float] =
    if p2 < 0 then Nothingness else Something(p1/p2)

  def main(args: Array[String]): Unit = {
    println(func(5.6, 2))
  }