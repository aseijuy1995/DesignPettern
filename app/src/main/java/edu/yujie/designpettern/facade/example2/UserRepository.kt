package edu.yujie.designpettern.facade.example2

class UserRepository {
    val complexSystemStore = ComplexSystemStore("/data/default.prefs")

    fun save(user: User) {
        complexSystemStore.save("USER_KEY", user.login)
        complexSystemStore.commit()
    }

    fun findFirst() = User(complexSystemStore.read("USER_KEY"))
}