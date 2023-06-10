class Account(
  internal val holder: String,
  internal val number: Int,
  private val password: String
) {
  internal var balance = 0.0

  fun deposit(value: Double) {
    balance += value
  }

  fun withdraw(value: Double) {
    if (balance >= value) {
      balance -= value
    }
  }

  fun transfer(value: Double, destiny: Account): Boolean {
    println("Transferindo $value da conta de $holder para a conta de ${destiny.holder}.")

    if (balance >= value) {
      balance -= value
      destiny.deposit(value)
      return true
    }

    return false
  }

  fun inputPassword(): Boolean {
    println("Digite sua senha: ")
    val password = readlnOrNull()

    return password == this.password
  }
}