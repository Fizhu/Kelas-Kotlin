
fun main() {
    val mobil = Mobil(4,"Merah","VW")
    val mobil2 = Mobil(
        jumlahBan = 4,
        warna = "Biru",
        merek = "Daihatsu"
    )
    print(mobil.merek)
    mobil.hitung()
}

data class Mobil(
    val jumlahBan: Int,
    val warna: String,
    val merek: String
) {
    fun hitung() {
        print("HITUNG")
    }
}