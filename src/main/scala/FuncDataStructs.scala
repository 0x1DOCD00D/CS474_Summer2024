object FuncDataStructs:
  trait OurList[+T]
  case object EmptyList extends OurList[Nothing]
  case class ::[+T](head: T, tail: OurList[T]) extends OurList[T]

  trait OurTree[+T]:
    val left: OurTree[T]
    val right: OurTree[T]
    val data: Option[T]

  case class RealTree[T](l: OurTree[T], r: OurTree[T], d: T) extends OurTree[T]:
    override val left: OurTree[T] = l
    override val right: OurTree[T] = r
    override val data: Option[T] = Some(d)

  case object EmptyTree extends OurTree[Nothing]:
    override val left: OurTree[Nothing] = null
    override val right: OurTree[Nothing] = null
    override val data: Option[Nothing] = None

  //  [E](ref)->[E](ref)->...->[E]()
  def printOutTreeData(p: OurTree[Int]): Unit =
    p match
      case EmptyTree => ()
      case RealTree(l, r, d) =>
        printOutTreeData(l)
        printOutTreeData(r)
        println(d)
      case _ => ???

  //  [E](ref)->[E](ref)->...->[E]()
  def printOutLengths(p: OurList[String]): OurList[Int] =
    p match
      case ::(head, tail) => ::(head.length, printOutLengths(tail))
      case EmptyList => EmptyList
      case _ => ???

  def main(args: Array[String]): Unit = {
    val emptyTree = EmptyTree
    val realTree = RealTree(
      RealTree(EmptyTree, EmptyTree, 0),
      RealTree(EmptyTree, EmptyTree, 0),
      1
    )
    println(realTree)
    printOutTreeData(realTree)
    val emptyLst = EmptyList
    val someList1 = ::("Himanshu",
      ::("Dylan",
        ::("Yurii",
          ::("Maria",
            ::("Ciara",
              ::("Natalia", EmptyList)
            )
          )
        )
      )
    )
    println(someList1)
    val newList1 = printOutLengths(someList1)
    println(newList1)
  }