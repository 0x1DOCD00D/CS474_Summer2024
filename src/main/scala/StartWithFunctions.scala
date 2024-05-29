object StartWithFunctions:
  val list = List[(Int,Int)]((2,3), (4,5), (6,7))

  object MyOwnFunction extends Function[(Int,Int), Int]:
    override def apply(v1: (Int, Int)): Int = v1._1*v1._1+v1._2*v1._2


  @main def runStartWithFunctions() =
    val f = (v1: (Int, Int)) => v1._1*v1._1+v1._2*v1._2
    println(f)
    println(f((10,5)))
    list.foreach(element => println(f(element)))
//    list.foreach(element => println(element._1*element._1 + element._2*element._2))
//    list.foreach(e=>println(MyOwnFunction(e)))
//    println("Bam!")
