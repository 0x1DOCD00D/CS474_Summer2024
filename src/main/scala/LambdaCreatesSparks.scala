object LambdaCreatesSparks:
//  λf. λx.f(f x)
  val lambdaExp = (f: Double =>Double, x: Double) => f(f(x))
  def curriedF(f: Double => Double)(x: Double): Double = f(f(x))

  @main def runSparks() =
    println(lambdaExp((i:Double)=>scala.math.sqrt(i), 81))
    val someF = curriedF((i:Double)=>scala.math.sqrt(i))
    println(someF(625))
//    println(curriedF((i:Double)=>scala.math.sqrt(i))(625))