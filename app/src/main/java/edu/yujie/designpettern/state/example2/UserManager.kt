package edu.yujie.designpettern.state.example2

class UserManager {
    private var user: IUserFun = Guest()

    fun setUserState(user: IUserFun) {
        this.user = user
    }

    fun collect(block: () -> Unit) = user.onCollect(block)

    fun share(block: () -> Unit) = user.onShare(block)

    fun edit(block: () -> Unit) = user.onEdit(block)

    fun delete(block: () -> Unit) = user.onDelete(block)
}