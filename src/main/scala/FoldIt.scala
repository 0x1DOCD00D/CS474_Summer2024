object FoldIt:
  val myData = List(1, 5, 8, 11, 12)
  val myDataString = List("a", "b", "c")
  val f = (i:Int)=> List(i-1,i,i+1)

  def myFilter[T](lp: List[T])(f: T => Boolean): List[T] =
    lp.foldLeft(List())((acc,e)=> if f(e)  then acc ::: List(e) else acc)

  def main(args: Array[String]): Unit = {
    println(myFilter(myData)((i:Int)=> if i > 10 then true else false))
    val res = myData.foldLeft(List[Int]())((acc,v)=>acc ::: f(v))
    println(res)
    val res1 =myDataString.foldLeft(List[String]())((acc,e)=> acc ::: List(e))
    val res2 =myDataString.foldRight(List[String]())((e, acc)=> acc ::: List(e))
    println(res1)
    println(res2)
  }