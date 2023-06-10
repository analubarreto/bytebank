class Bank(private var accounts: List<Account>) {

  fun login(): Account {
    println("Digite seu nome: ")
    val name = readln()

    val account = accounts.firstOrNull { it.holder == name }
      ?: throw Exception("Conta não encontrada")

    if (!account.inputPassword()) {
      throw Exception("Senha incorreta")
    }

    return account
  }

  fun selectAccount(): Account {
    val number = readlnOrNull()?.toInt()

    val account = accounts.firstOrNull { it.number == number }
      ?: throw Exception("Conta não encontrada")

    return account
  }
}