object Calculator:
  enum CalcOps:
    case ADD(op1: Int, op2: Int)
    case SUB(op1: Int, op2: Int)
    case MULT(op1: Int, op2: Int)
    case DIV(op1: Int, op2: Int)

    def eval(): Int = this match
      case CalcOps.ADD(op1, op2) => op1+op2
      case CalcOps.SUB(op1, op2) => op1-op2
      case CalcOps.MULT(op1, op2) => op1*op2
      case CalcOps.DIV(op1, op2) => op1/op2


  @main def runCalculator =
    import CalcOps.*
    println(ADD(SUB(6,2).eval(),MULT(3,5).eval()).eval())

