class Director(
  private val name: String,
  private val age: Int,
  private val salary: Int,
  private val cpf: String,
  private val plr: Double
): Employee(name, age, salary, cpf) {
  override val bonus: Double
    get() = (salary * 0.1) + salary + plr

  override fun toString(): String {
    return "Director(name='$name', age=$age, cpf=$cpf, salary=$salary)"
  }
}