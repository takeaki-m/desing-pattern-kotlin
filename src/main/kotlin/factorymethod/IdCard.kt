package factorymethod

class IdCard(var owner: String): AbstractProduct(){
    init {
        println(this.owner + "のIDカードを作成します")
    }
    override fun use() {
        println(this.owner + "のIDカードを使います")
    }

}