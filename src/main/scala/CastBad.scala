object CastBad {
  class C1
  class C2 extends C1
  def main(args: Array[String]): Unit = {
    val o:C1 = new C1
//    val o1:C2 = o:C2
    val o1:C2 = o.asInstanceOf[C2]
  }

}
