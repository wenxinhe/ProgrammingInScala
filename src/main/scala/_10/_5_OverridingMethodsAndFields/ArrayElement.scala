package _10._5_OverridingMethodsAndFields

import _10._3_DefiningParameterlessMethods.Element

class ArrayElement(conts: Array[String]) extends Element {

  // Scala's two namespaces are:
  // values (fields, methods, packages, and singleton objects)
  // types (class and trait names)

  // overriden for fields and methods belong to the same namespace
  val contents = conts
}

