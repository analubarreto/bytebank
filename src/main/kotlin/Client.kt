class Client(val name: String, val cpf: String, val password: String) : AuthUser {

    override fun login(password: String): Boolean {
        return this.password == password
    }

    override fun toString(): String {
        return "Client(name='$name', cpf='$cpf', password='$password')"
    }
}