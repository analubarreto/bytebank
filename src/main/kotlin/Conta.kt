class Account(var holder: String, private var number: Int, var password: String) {

    var balance = 0.0

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
}