class SavingsAccount(
  holder: String,
  number: Int,
  password: String
) : Account(
  holder,
  number,
  password) {
  override fun withdraw(value: Double) {
    val valueWithTax = value + 0.1
    super.withdraw(valueWithTax)
  }
}