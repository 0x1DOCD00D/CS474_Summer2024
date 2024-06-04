import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object Imperative2Functional:
  val rosterOfStudents = List("Dylan", "Himanshu", "Yurii", "Maria", "Larry")
  val f: String => Int = (s: String)=>s.length
  val g: Int => Float = (i: Int)=>i.toFloat/3.14f


  @main def runImp2Func() =
    val result = rosterOfStudents.map(f).map(g)
    println(result.mkString(", "))
    println(rosterOfStudents)

 /* var rosterOfStudents = Array[String|Int]("Dylan", "Himanshu", "Yurii", "Maria", "Larry")
  var students = rosterOfStudents.length


  @main def runImp2Func() =
    var i = 0
    while(i< students) {
      rosterOfStudents(i) = rosterOfStudents(i) match
        case s: String => s.length
      i = i +1
    }

    i = 0
    while (i < students) {
      println(rosterOfStudents(i))
      i = i + 1
    }
*/