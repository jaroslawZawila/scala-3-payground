class Car(model: String, year: Int){
  def this(model: String) = this(model, 2020)
  
  override def toString() = s"Model: $model, year: $year"
}

@main def creatorApplications() = {
  val ford = Car("Mustang", 2010)
  val chevvy = Car("Chevrolet")
  
  println(ford)
  println(chevvy)
}