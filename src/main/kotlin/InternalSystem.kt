class InternalSystem {
  fun login(manager: Admin, password: Int) {
    if (manager.login(password)) {
      println("Welcome to Bytebank")
    } else {
      println("Wrong password")
    }
  }
}