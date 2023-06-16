fun main() {
  val accounts = listOf(
    CheckingAccount("Alex", 1000, "1234"),
    SavingsAccount("Fran", 1001, "5678"),
    CheckingAccount("Gui", 1002, "9876"),
    SavingsAccount("Maria", 1003, "5432")
  )
  val byteBank = Bank(accounts)

  val employees = listOf(
    Manager("Alex", 19, 1000, "111.111.111-11", "1234"),
    Director("Fran", 20, 1001, "222.222.222-22", 200.0),
    Analyst("Gui", 21, 1002, "333.333.333-33"),
    Analyst("Maria", 22, 1003, "444.444.444-44")
  )
}