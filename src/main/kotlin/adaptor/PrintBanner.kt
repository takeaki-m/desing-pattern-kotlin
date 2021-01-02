package adaptor


//スーパークラスの参照に続けてそのコンストラクタ引数を与える
class PrintBanner(private val string: String) : Print, Banner(string){
    override fun printWeak() {
        super.showWithPattern()
    }

    override fun printStrong() {
        super.showWithAster()
    }
}