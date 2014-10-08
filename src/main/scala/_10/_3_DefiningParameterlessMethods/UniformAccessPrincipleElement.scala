package _10._3_DefiningParameterlessMethods

abstract class UniformAccessPrincipleElement {

  // method and field are in the same namespace in scala
  // uniform access field of Element
  val height: Int = contents.length
  // uniform access field of Element
  val width: Int = if (height == 0) 0 else contents(0).length

  // abstract method
  def contents: Array[String]
}
