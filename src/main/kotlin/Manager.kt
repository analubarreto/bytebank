class Manager(
  private val name: String,
  private val age: Int,
  private val salary: Int,
  private val cpf: String,
  override val password: String,
): Admin(name, age, salary, cpf, password), AuthUser {
  override val bonus: Double
    get() = salary * 0.2

  override fun login(password: String): Boolean {
    return super<Admin>.login(password)
  }

  override fun toString(): String {
    return "Manager(name='$name', age=$age, cpf=$cpf, salary=$salary)"
  }
}