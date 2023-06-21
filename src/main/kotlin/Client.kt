class Client(val name: String, val cpf: String, override val password: String) : AuthUser {
    override fun toString(): String {
        return "Client(name='$name', cpf='$cpf', password='$password')"
    }
}