object LiskovSubstitutivity:
    class C1
    class C2 extends C1
    class C3 extends C2
    class C4 extends C3
    class C5 extends C2
    class C6 extends C5
//    val o1: C6 = new C5
//    val o2: C1 = new C6
//    val o3: C3 = new C5
//    val o4: C5 = new C3
//    val o5: C2 = new C6
//    val o6: C4 = new C1