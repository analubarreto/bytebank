class CheckingAccount(
  holder: String,
  number: Int,
  password: String
) : Account(
  holder,
  number,
  password) {
  override fun withdraw(value: Double) {
    val withTax = value + 0.1
    if (balance >= withTax) {
      balance -= withTax
    }
  }
}