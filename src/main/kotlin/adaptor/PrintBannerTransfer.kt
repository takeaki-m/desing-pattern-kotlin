package adaptor


class PrintBannerTransfer(private val string: String, private val banner: Banner) : PrintTransfer() {

    override fun printWeak() {
        banner.showWithPattern()
    }

    override fun printStrong() {
        banner.showWithAster()
    }
}