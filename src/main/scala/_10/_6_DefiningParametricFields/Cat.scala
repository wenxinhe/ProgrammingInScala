package _10._6_DefiningParametricFields

class Cat {
  val dangerous = false
}

class Tiger(override val dangerous: Boolean, private var age: Int) extends Cat {
  def getAge = age
}

