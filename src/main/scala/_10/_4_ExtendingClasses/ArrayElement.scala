package _10._4_ExtendingClasses

import _10._3_DefiningParameterlessMethods.Element

class ArrayElement(conts: Array[String]) extends Element {
  def contents = conts
}

object ArrayElement {
  def main(args: Array[String]): Unit = {
    val ae: Element = new ArrayElement(Array("hello", "world"))
    assert(ae.width == 5)
  }
}