open class Employee(
  open val name: String,
  open val age: Int,
  open val salary: Int,
  open val cpf: String,
) {
  open val bonus: Double get() = salary * 0.1
  override fun toString(): String {
    return "Employee(name='$name', age=$age, cpf=$cpf, salary=$salary)"
  }
}