object FboundedPoly:
  abstract class Person
  class Student extends Person with ComparisonMechanism[Student]:
    override def compareTo(otherObject: Student): Boolean = ???

  class Prof extends Person
  
  class Admin extends Person with ComparisonMechanism[Admin]:
    override def compareTo(otherObject: Admin): Boolean = ???


  trait ComparisonMechanism[T]:
//    self: Student =>
    def compareTo(otherObject: T): Boolean

  @main def runFpoly()=
    val mark = new Prof with ComparisonMechanism[Prof]:
      override def compareTo(otherObject: Prof): Boolean = otherObject.hashCode() == this.hashCode()
    val dylan = new Student with ComparisonMechanism[Student]:
      override def compareTo(otherObject: Student): Boolean = otherObject.hashCode() == this.hashCode()

//    println(mark.compareTo(dylan))