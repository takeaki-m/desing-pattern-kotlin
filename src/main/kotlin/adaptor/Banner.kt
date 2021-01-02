package adaptor

/**
 * 経書を許可する場合にはopenをつける
 * つけいない場合にはデフォルトでJavaでのfinal classになる
 */
open class Banner(private val string: String) {
    fun showWithPattern(){
        println("(" + this.string + ")")}
    fun showWithAster(){
        println("*" + this.string + "*")}
}