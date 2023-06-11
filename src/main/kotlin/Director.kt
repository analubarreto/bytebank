class Director(
  override val name: String,
  override val age: Int,
  override val salary: Int,
  override val cpf: String,
  private val plr: Double
): Employee(name, age, salary, cpf) {
  override val bonus: Double get() = salary * 0.3

  override fun toString(): String {
    return "Director(name='$name', age=$age, cpf=$cpf, salary=$salary)"
  }

  fun plr(): Double {
    return salary + plr
  }
}