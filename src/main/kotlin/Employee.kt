abstract class Employee(
  private val name: String,
  private val age: Int,
  private val salary: Int,
  private val cpf: String,
) {
  abstract val bonus: Double
  override fun toString(): String {
    return "Employee(name='$name', age=$age, cpf=$cpf, salary=$salary)"
  }
}