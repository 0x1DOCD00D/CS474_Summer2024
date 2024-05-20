object InheritFields:
  class C1:
    val field = 1

  class C2 extends C1:
    override val field: Int = 2

  @main def runFields() =
    val obj: C1 = new C2
    println(obj.field)
