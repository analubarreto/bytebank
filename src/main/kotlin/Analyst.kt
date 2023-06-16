class Analyst(
  private val name: String,
  private val age: Int,
  private val salary: Int,
  private val cpf: String,
): Employee(
  name,
  age,
  salary,
  cpf,
) {
  override val bonus: Double
    get() = (salary + 0.1) + salary * 0.1

  override fun toString(): String {
    return "Analyst(name='$name', age=$age, cpf=$cpf, salary=$salary)"
  }
}