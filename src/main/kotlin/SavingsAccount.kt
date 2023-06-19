class SavingsAccount(
  holder: String,
  number: Int,
  password: String
) : Account(
  holder,
  number,
  password) {
  override fun withdraw(value: Double) {
    withdraw(value)
  }
}