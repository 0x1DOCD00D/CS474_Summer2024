object TraitModeling:
  trait MariaSave:
    def save(d: String) = s"Maria saved us: $d"

  class LarryDocMgmtSystem extends MariaSave:
    def createDocument() = println("doc")

  class HimanshuImageMgmtSystem:
    val saving = new MariaSave {}
    def createImage() =
      saving.save("Himanshu")

  class LibraryStuff

  class CiaraLibraryMgmtSystem extends LibraryStuff with MariaSave:
    def createDocument() = save("Ciara")

  @main def runTraitModeling() =
    println(new HimanshuImageMgmtSystem().createImage())