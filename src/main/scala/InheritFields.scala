object InheritFields:
  class C1:
    val field = 0

  class C2 extends C1:
    override val field: Int = 2

  class C3 extends C1:
    override val field: Int = 3

  @main def runFields() =
    val obj: C1 = new C3
    println((obj.asInstanceOf[C2]).field)
