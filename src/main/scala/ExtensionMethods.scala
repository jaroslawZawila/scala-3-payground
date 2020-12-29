case class Circle(x: Double, y: Double, radius: Double)

extension (c: Circle)
  def circumference: Double = c.radius * math.Pi * 2


@main def extensionMethods() = {
  println(Circle(2,2,2).circumference)
}