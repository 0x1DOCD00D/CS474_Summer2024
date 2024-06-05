object CombinatorsWorkshop:
  case class MyRecord[T](get: T)
  val l = List(1,2,3,4,"Maria")

  def map[T, S](r: MyRecord[T])(f: T => S): MyRecord[S] =
    MyRecord(f(r.get))

  def main(args: Array[String]): Unit = {
    println(MyRecord("Dylan"))
    println(map(MyRecord("Dylan"))((i:String)=>i.length))
  }