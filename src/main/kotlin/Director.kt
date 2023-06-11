class Director(
  override val name: String,
  override val age: Int,
  override val salary: Int,
  override val cpf: String,
  private val plr: Double
): Employee(name, age, salary, cpf) {
  override val bonus: Double get() = super.bonus + salary + plr

  override fun toString(): String {
    return "Director(name='$name', age=$age, cpf=$cpf, salary=$salary)"
  }
}