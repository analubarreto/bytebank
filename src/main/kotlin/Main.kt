fun main() {
  val accounts = listOf(
    Account("Alex", 1000, "1234"),
    Account("Fran", 1001, "5678"),
    Account("Gui", 1002, "9876"),
    Account("Maria", 1003, "5432")
  )
  val byteBank = Bank(accounts)

  println("Bem vindos ao Bytebank")

  byteBank.login().let { account ->
    println("Bem vindo ${account.holder}")
    selectOption(account, byteBank)
  }
}