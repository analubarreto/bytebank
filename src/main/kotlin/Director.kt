class Director(
  private val name: String,
  private val age: Int,
  private val salary: Int,
  private val cpf: String,
  private val plr: Double,
  private val password: String,
): Admin(name, age, salary, cpf, password) {
  override val bonus: Double
    get() = (salary * 0.1) + salary + plr

  override fun toString(): String {
    return "Director(name='$name', age=$age, cpf=$cpf, salary=$salary)"
  }
}