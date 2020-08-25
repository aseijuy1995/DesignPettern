package edu.yujie.designpettern.state.example2

import edu.yujie.designpettern.getMethodName

interface IUserFun {
    fun onCollect(block: () -> Unit)

    fun onShare(block: () -> Unit)

    fun onEdit(block: () -> Unit)

    fun onDelete(block: () -> Unit)
}

class Guest : IUserFun {
    override fun onCollect(block: () -> Unit) {
        println("Please Login")
    }

    override fun onShare(block: () -> Unit) {
        println("Please Login")
    }

    override fun onEdit(block: () -> Unit) {
        println("Please Login")
    }

    override fun onDelete(block: () -> Unit) {
        println("Please Login")
    }
}

class Normal : IUserFun {
    override fun onCollect(block: () -> Unit) {
        println("Normal:${getMethodName()}")
        block()
    }

    override fun onShare(block: () -> Unit) {
        println("Normal:${getMethodName()}")
        block()
    }

    override fun onEdit(block: () -> Unit) {
        println("No Permission")
    }

    override fun onDelete(block: () -> Unit) {
        println("No Permission")
    }
}

class Admin : IUserFun {
    override fun onCollect(block: () -> Unit) {
        println("No Permission")
    }

    override fun onShare(block: () -> Unit) {
        println("No Permission")
    }

    override fun onEdit(block: () -> Unit) {
        println("Admin:${getMethodName()}")
        block()
    }

    override fun onDelete(block: () -> Unit) {
        println("Admin:${getMethodName()}")
        block()
    }

}