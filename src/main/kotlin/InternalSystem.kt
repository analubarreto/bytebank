class InternalSystem {
  fun login(manager: Admin, password: String) {
    if (manager.authenticate(password)) {
      println("Welcome to Bytebank")
    } else {
      println("Wrong password")
    }
  }
}