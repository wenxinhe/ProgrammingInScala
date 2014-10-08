package _10._6_DefiningParametricFields

class Cat {
  val dangerous = false
}

class Tiger(override val dangerous: Boolean, private var age: Int) extends Cat {
  def getAge = age
}

object Main {

  def main(args: Array[String]): Unit = {
    val tiger: Tiger = new Tiger(true, 15)
    assert(tiger.dangerous)
    assert(tiger.getAge == 15)
  }

}
