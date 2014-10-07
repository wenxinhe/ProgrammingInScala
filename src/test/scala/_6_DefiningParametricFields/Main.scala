package _6_DefiningParametricFields

import _10._6_DefiningParametricFields.Tiger


object Main {

  def main(args: Array[String]): Unit = {
    val tiger: Tiger = new Tiger(true, 15)
    assert(tiger.dangerous)
    assert(tiger.getAge == 15)
  }

}