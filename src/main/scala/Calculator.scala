object Calculator:
  enum CalcOps[T <: Double]:
    case ADD(op1: T, op2: T)
    case SUB(op1: T, op2: T)
    case MULT(op1: T, op2: T)
    case DIV(op1: T, op2: T)

    def eval(): Double = this match
      case CalcOps.ADD(op1, op2) => op1 + op2
      case CalcOps.SUB(op1, op2) => op1 - op2
      case CalcOps.MULT(op1, op2) => op1 * op2
      case CalcOps.DIV(op1, op2) => op1 / op2


  @main def runCalculator =
    import CalcOps.*
    println(ADD(SUB(6,2).eval(),MULT(3,5).eval()).eval())
    val lst = List(1,2, 3.14, "himanshu")

