object DynamicDispatch:
  class C1
  class C2 extends C1
  class C3 extends C2
  class C4 extends C2
  class C5 extends C3

  class Utsav

  def ImplDynDispatch(o: Any): Int =
    if o.isInstanceOf[C5] then 0
    else if o.isInstanceOf[C4] then 1
    else if o.isInstanceOf[C3] then 2
    else if o.isInstanceOf[C2] then 3
    else if o.isInstanceOf[C1] then 4
    else 6


  @main def runDynDispatch(): Unit =
    println(ImplDynDispatch(new C2))
    println(ImplDynDispatch(new C1))
    println(ImplDynDispatch(new C5))
    println(ImplDynDispatch(new Utsav))