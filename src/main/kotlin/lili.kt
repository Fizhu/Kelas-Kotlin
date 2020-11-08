//main function
fun main(){
    val Phi = 3.14
    val sisiKubus = 6
    val jariTabung = 7
    val tinggiTabung = 16
    val jariBola = 9

    luasKubus(sisiKubus)
    volumeKubus(sisiKubus)
    luasTabung(jariTabung, tinggiTabung, Phi)
    volumeTabung(jariTabung, tinggiTabung, Phi)
    luasBola(Phi, jariBola)
    volumeBola(Phi, jariBola)
}

fun luasKubus(sisiKubus: Int){
    val LK = 6 * sisiKubus
    println("Luas permukaan kubus = $LK")
}

fun volumeKubus(sisiKubus: Int){
    val VK = sisiKubus * sisiKubus * sisiKubus
    println("Volume kubus = $VK")
}

fun luasTabung(jariTabung: Int, tinggiTabung: Int, Phi: Double){
    val LT = (2 * Phi * jariTabung * tinggiTabung) + (2 * Phi * jariTabung * jariTabung)
    println("Luas permukaan tabung = $LT")
}

fun volumeTabung(jariTabung: Int, tinggiTabung: Int, Phi: Double){
    val VT = Phi * jariTabung * jariTabung * tinggiTabung
    println("Volume tabung = $VT")
}

fun luasBola(Phi: Double, jariBola: Int){
    val LB = 4 * Phi * jariBola * jariBola
    println("Luas permukaan bola = $LB")
}

fun volumeBola(Phi: Double, jariBola: Int){
    val VB = 4 / 3 * Phi * jariBola * jariBola * jariBola
    println("Volume bola = $VB")
}