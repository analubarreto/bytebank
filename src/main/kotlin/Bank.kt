class Bank(private var accounts: List<Account>) {

  fun login(): Account {
    println("Digite seu nome: ")
    val name = readln()

    val account = accounts.firstOrNull { it.holder == name }
      ?: throw Exception("Conta não encontrada")

    println("Digite sua senha: ")
    val password = readln()

    if (account.password != password) {
      throw Exception("Senha incorreta")
    }

    return account
  }
}