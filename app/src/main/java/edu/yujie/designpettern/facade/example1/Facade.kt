package edu.yujie.designpettern.facade.example1

class Facade {
    private val subClassOne = SubClassOne()
    private val subClassTwo = SubClassTwo()
    private val subClassThree = SubClassThree()
    private val subClassFour = SubClassFour()

    fun methodA(){
        subClassOne.methodOne()
        subClassTwo.methodTwo()
    }

    fun methodB(){
        subClassThree.methodThree()
        subClassFour.methodFour()
    }
}