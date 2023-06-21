interface AuthUser {
  val password: String

  fun login(password: String) : Boolean {
    return this.password == password
  }
}