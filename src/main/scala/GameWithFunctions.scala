object GameWithFunctions:
//  var sideEffect = 0
  val f: (String, Int) => (Int, Int) = (s:String, times:Int) => {
    (s.length, times +1)
  }

//  val g: String => Int = (s: String) => {
//    if sideEffect > 0 then (s+s).length
//    else s.length
//  }
  
  @main def runGame()=
    f("sssw", f("ddd",0)._2)
    
    println("game")