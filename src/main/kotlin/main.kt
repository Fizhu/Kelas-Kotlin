val phi = 3.14

fun main() {
    println("Luas Lingkaran : ${luasLingkaran(5.0)}")
    println("Volume Lingkaran : ${volumeLingkaran(5.0)}")
}

fun luasLingkaran(jariJari: Double): Double {
    return 4*phi*(jariJari*jariJari)
}

fun volumeLingkaran(jariJari: Double): Double {
    return 4/3*phi*(jariJari*jariJari*jariJari)
}