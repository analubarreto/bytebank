fun selectOption(account: Account, bank: Bank) {
  println("Digite 1 para depositar, 2 para sacar, 3 para ver saldo, 4 para transferir e 5 para fechar o menu: ")

  when (readlnOrNull()?.toInt()) {
    1 -> {
      println("Digite o valor que deseja depositar: ")

      val value = readlnOrNull()?.toDouble()
      account.deposit(value!!)

      println("Depósito realizado com sucesso, seu novo saldo é: ${account.balance}")
      selectOption(account, bank)
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

      selectOption(account, bank)
    }

    3 -> {
      println("Seu saldo é: ${account.balance}")
      selectOption(account, bank)
    }

    4 -> {
      println("Digite o valor que deseja transferir: ")
      val value = readlnOrNull()?.toDouble()

      println("Digite o número da conta para qual deseja transferir: ")
      val destiny = bank.selectAccount()

      if (account.transfer(value!!, destiny)) {
        println("Transferência realizada com sucesso, seu novo saldo é: ${account.balance}")
      } else {
        println("Saldo insuficiente para realizar a transferência")
      }

      selectOption(account, bank)
    }

    5 -> println("Obrigada por utilizar nossos serviços")
    else -> {
      println("Opção inválida")
      selectOption(account, bank)
    }
  }
}