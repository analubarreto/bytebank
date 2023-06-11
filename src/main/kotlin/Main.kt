fun main() {
  val accounts = listOf(
    Account("Alex", 1000, "1234"),
    Account("Fran", 1001, "5678"),
    Account("Gui", 1002, "9876"),
    Account("Maria", 1003, "5432")
  )
  val byteBank = Bank(accounts)

//  println("Bem vindos ao Bytebank")
//
//  byteBank.login().let { account ->
//    println("Bem vindo ${account.holder}")
//    selectOption(account, byteBank)
//  }

  val alex = Employee("Alex", 14, 1000, "111.111.111-11")
  println(alex.toString())
  println(alex.bonification())

  val fran = Manager("Fran", 15, 2000, "222.222.222-22", "1234")
  println(fran.toString())
  println(fran.bonification())
  fran.authenticate()

  val gui = Director("Gui", 16, 3000, "333.333.333-33", 200.0)
  println(gui.toString())
  println(gui.bonification())
  println(gui.plr())
}