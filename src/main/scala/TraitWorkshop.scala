object TraitWorkshop:
  trait X
  class Human
  trait Glasses:
    def levelOfVision = 1
//  class XHuman extends X
  trait Vehicle:
    trait Engine:
      trait Spark
      trait Piston
    trait Cabin

  val yurii = new Human with X {}
  val natalia = new Human with Glasses {

  }
  println(natalia.levelOfVision)
  @main def runTraitWorkshop() =
    println(yurii.isInstanceOf[X])
    println(natalia.isInstanceOf[X])