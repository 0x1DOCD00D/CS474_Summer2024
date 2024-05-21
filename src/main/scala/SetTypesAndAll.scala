object SetTypesAndAll:
  class C:
    def f(): Unit = {
      println("C")
    }
  class B extends C:
    override def f()={
      println("B")
    }

  @main def runAllofThat() =
    class C
    class M extends C

    val x:Any = throw new Exception()
    val v1:2|3 = 3
    val v2:2|3 = 2
    val o: C & M = new M
    println(v1==v2)
//    val storageUnitForC = new C
//    val createNewVar: B = storageUnitForC.asInstanceOf[B]
//    createNewVar.f()
