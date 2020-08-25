package edu.yujie.designpettern.observe.example1

import edu.yujie.designpettern.observe.example1.PodcastA
import edu.yujie.designpettern.observe.example1.Student

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val podcastA = PodcastA()
    val student1 =
        Student("student1", podcastA)
    val student2 =
        Student("student2", podcastA)

    podcastA.add(student1)
    podcastA.add(student2)
    podcastA.updateAll()
    println("--------------------------")
    podcastA.remove(student2)
    podcastA.updateAll()
    println("--------------------------")
    podcastA.name = "流行歌"
    podcastA.add(student1)
    podcastA.updateAll()
}