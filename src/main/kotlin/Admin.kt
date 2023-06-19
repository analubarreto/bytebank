abstract class Admin(
  private val name: String,
  private val age: Int,
  private val salary: Int,
  private val cpf: String,
  private val password: String,
): Employee(name, age, salary, cpf) {
  abstract override val bonus: Double
  override fun toString(): String {
    return "Employee(name='$name', age=$age, cpf=$cpf, salary=$salary)"
  }

  fun authenticate(password: String): Boolean {
    println("Digite a senha: ")
    val password = readln()
    return this.password == password
  }
}