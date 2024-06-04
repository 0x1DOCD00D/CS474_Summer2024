object GameWithPureFunctions:
  val s: String = "purity is here!"
  case class Student(name:String, gpa: Float)

  val f: Int => Double => String = (p1: Int) => (p2: Double) => p1.toString + "_" + p2.toString
  val f1 = f(3)
  val f2 = f1(9.1)
  val g: Int => String = (p1: Int) => p1.toHexString
  val h: String => String = (p1: String) => p1.hashCode().toString + "_" + p1
  val composition = (i:Int)=>h(g(i))

  def compositionFunc[T,S,Q](x: T=>S, y:S=>Q): T => Q = (i:T)=>y(x(i))

  def s[T](p:T=>T):T=>T = p

  val d: Int => Int = (i:Int)=>i+1
  val dd = (i:Int)=> d(d(i))
//  (i:Int)=> ((i:Int)=>i+1)((i:Int)=>i+1(i))(1)
  val ddd = (i:Int)=> d(d(d(i)))
  val dddd = (i:Int)=> d(d(d(d(i))))
  val ddddd = (i:Int)=> d(d(d(d(d(i)))))

  def nTimesFuncApply(n: Int, f:Int=>Int): Int=>Int =
    require(n >= 0)
    if n ==0 then (i:Int)=>i
    else (i:Int)=>(nTimesFuncApply(n-1, f)(f(i)))
//    (i:Int)=>(nTimesFuncApply(3-2, f)(f(i)))
//    (i:Int)=>((i:Int)=>(nTimesFuncApply(2-1, f)(f(i)))(3-2, f)(f(i)))


  @main def runPureShtuff() =
    val res = nTimesFuncApply(3, (i:Int)=>i+1)(2)
    println(s"resulting ntimes $res")
    println(ddddd(1))
    val selfComp = s(s(s(s((i:Int)=>i+1))))(2)
    println(selfComp)
    println(s)
    println(Student("Dylan", 3.9))
    println(f)
    println(f1)
    println(f2)
    println(composition)
    println(compositionFunc(g, h)(25))
