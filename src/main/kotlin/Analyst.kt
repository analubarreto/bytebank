class Analyst(
  override val name: String,
  override val age: Int,
  override val salary: Int,
  override val cpf: String,
): Employee(
  name,
  age,
  salary,
  cpf,
) {
  override val bonus: Double get() = super.bonus + salary * 0.1

  override fun toString(): String {
    return "Analyst(name='$name', age=$age, cpf=$cpf, salary=$salary)"
  }
}