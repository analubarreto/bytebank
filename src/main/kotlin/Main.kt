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
        selectOption(account)
    }
}

fun selectOption(account: Account) {
    println("Digite 1 para depositar, 2 para sacar, 3 para ver saldo e 4 para fechar o menu: ")

    when (readlnOrNull()?.toInt()) {
        1 -> {
            println("Digite o valor que deseja depositar: ")

            val value = readlnOrNull()?.toDouble()
            account.deposit(value!!)

            println("Depósito realizado com sucesso, seu novo saldo é: ${account.balance}")
            selectOption(account)
        }
        2 -> {
            if (account.balance == 0.0) {
                println("Você não possui saldo para sacar")
                return
            }
            println("Digite o valor que deseja sacar: ")
            val valor = readlnOrNull()?.toDouble()

            account.withdraw(valor!!)
            println("Saque realizado com sucesso, seu novo saldo é: ${account.balance}")

            selectOption(account)
        }
        3 -> {
            println("Seu saldo é: ${account.balance}")
            selectOption(account)
        }
        4 -> println("Obrigada por utilizar nossos serviços")
        else -> {
            println("Opção inválida")
            selectOption(account)
        }
    }
}