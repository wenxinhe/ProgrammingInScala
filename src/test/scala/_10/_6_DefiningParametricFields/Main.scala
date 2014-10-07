package _10._6_DefiningParametricFields


object Main {

  def main(args: Array[String]): Unit = {
    val tiger: Tiger = new Tiger(true, 15)
    assert(tiger.dangerous)
    assert(tiger.getAge == 15)
  }

}