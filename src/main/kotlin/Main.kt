fun main(args: Array<String>) {
    val num = 5
    println("Násobek     Desítkově     Dvojkově     Šestnáctkově")
    for (i in 1..10) {

        val dec = num * i
        val binary = Integer.toBinaryString(dec)
        val hex = Integer.toHexString(dec)
        println("$i           $dec             $binary          $hex")
    }
}