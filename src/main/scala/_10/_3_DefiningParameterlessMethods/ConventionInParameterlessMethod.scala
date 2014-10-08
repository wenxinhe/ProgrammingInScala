package _10._3_DefiningParameterlessMethods

object ConventionInParameterlessMethod {

  def main(args: Array[String]) {
    Array(1, 2, 3).length // no () because no side-effect
    println() // better to no drop the () for side-effect
  }
}
