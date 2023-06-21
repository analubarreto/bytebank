class Director(
  private val name: String,
  private val age: Int,
  private val salary: Int,
  private val cpf: String,
  private val plr: Double,
  override val password: String,
): Admin(name, age, salary, cpf, password), AuthUser {
  override val bonus: Double
    get() = (salary * 0.1) + salary + plr

  override fun login(password: String): Boolean {
    return super<AuthUser>.login(password)
  }

  override fun toString(): String {
    return "Director(name='$name', age=$age, cpf=$cpf, salary=$salary)"
  }
}