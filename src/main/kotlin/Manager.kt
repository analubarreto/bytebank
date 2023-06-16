class Manager(
  private val name: String,
  private val age: Int,
  private val salary: Int,
  private val cpf: String,
  private val password: String
): Employee(name, age, salary, cpf) {
  override val bonus: Double
    get() = salary * 0.2
  override fun toString(): String {
    return "Manager(name='$name', age=$age, cpf=$cpf, salary=$salary)"
  }

  fun authenticate(): Boolean {
    println("Digite a senha: ")
    val password = readln()
    return this.password == password
  }
}