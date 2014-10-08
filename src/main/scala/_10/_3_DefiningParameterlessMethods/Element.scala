package _10._3_DefiningParameterlessMethods

abstract class Element {

  // abstract method
  def contents: Array[String]

  // parameterless method
  def height: Int = contents.length

  // parameterless method
  def width: Int = if (height == 0) 0 else contents(0).length
}
