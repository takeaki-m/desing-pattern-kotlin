package singleton

import java.time.LocalDateTime

/**
 * KotlinではJavaとはことなるObject宣言をすることでSingletonを表現できる
 */
object Singleton {
    var created: LocalDateTime = LocalDateTime.now();
    private var int: Int = 0
    init {
        int++
        println(int)
    }
    fun time(){
        println(created.toString())
    }
}