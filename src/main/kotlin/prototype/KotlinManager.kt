package prototype

class KotlinManager {
    private var showcase: HashMap<String, KotlinProduct> = HashMap<String, KotlinProduct>()

    fun register(name: String, proto: KotlinProduct){
        this.showcase.put(name, proto)
    }

    fun create(protoname: String): KotlinProduct{
        val p: KotlinProduct? = this.showcase.get(protoname)
        return p?.createCrone()!!

    }



}