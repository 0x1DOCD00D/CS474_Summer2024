object CompositionFunc {
  trait Employee
  trait Database
  def computation(rushi: Employee => Double, larry: Database => List[Employee] ): List[Double] =
    val res: List[Double] = larry(new Database {}).map(emp => rushi(emp))
    res
  @main def runComp() =
    println("compose")
}
