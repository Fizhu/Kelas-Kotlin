//Anwar Sahid
import java.util.*
var z ="yes"
val masukan= Scanner(System.`in`)
fun main() {
    statement()
    while (true) {
        print("Masukan Pilihan 1/2/3 :")
        val pilih = masukan.nextInt()
        if (pilih == 1) {
            kubus()
        } else if (pilih == 2) {
            tabung()
        } else if (pilih == 3) {
            balok()
        } else if (pilih > 3 || pilih < 1) {
            println("Masukan Anda Tidak Valid")
        }
        println(" ")
        print("Apakah Ingin Melanjutkan (Y/N): ")
        z= masukan.next()
        if(z=="N"||z=="n"){
            break
        }
    }
}

fun statement(){
    println("Program Menghitung Volume Bangun Ruang")
    println( "1. Kubus" )
    println( "2. Tabung")
    println( "3. Balok")
    println(" ")
}

fun kubus(){
    println("")
    println("------Kubus-------")
    print("masukan panjang sisi kubus :")
    val a= masukan.nextDouble()
    val b= a*a*a
    println(b)
}

fun tabung(){
    println("")
    println("------Tabung------")
    print("masukan panjang jari-jari :")
    val jariJari= masukan.nextDouble()
    print("masukan Tingi tabung :")
    val tinggi= masukan.nextDouble()
    val phi = 3.14
    println("Volume Tabung Adadlah : "+ jariJari*tinggi*phi)

}

fun balok (){
    println("")
    println("------Balok------")
    print("Masukan Panjang: ")
    val panjang = masukan.nextDouble()
    print("Masukan Lebar: ")
    val lebar= masukan.nextDouble()
    print("masukan tinngi: ")
    val tinggi= masukan.nextDouble()
    println("Luas Balok adalah : "+ panjang*tinggi*lebar)
}