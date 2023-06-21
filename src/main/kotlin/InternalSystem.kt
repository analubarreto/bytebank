class InternalSystem {
  fun login(manager: Admin, password: String) {
    if (manager.login(password)) {
      println("Welcome to Bytebank")
    } else {
      println("Wrong password")
    }
  }
}