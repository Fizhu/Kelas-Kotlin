//val ruby = 1000000
//val topaz = 1250000
//val permata = 3000000
//val jumlahRuby = 5
//val jumlahTopaz = 3
//val jumlahPermata = 1
//
//fun main() {
//    val incomeFromRuby = getMaxPotentialIncomePerItem("ruby")
//    val incomeFromTopaz = getMaxPotentialIncomePerItem("topaz")
//    val incomeFromPermata = getMaxPotentialIncomePerItem("permata")
//    val totalMaxIncome = incomeFromRuby + incomeFromTopaz + incomeFromPermata
//    print(totalMaxIncome)
//}
//
//fun getMaxPotentialIncomePerItem(type: String): Int {
//    return when (type) {
//        "ruby" -> {
//            getSellableItemCount(jumlahRuby) * ruby
//        }
//        "topaz" -> {
//            getSellableItemCount(jumlahTopaz) * topaz
//        }
//        else -> {
//            getSellableItemCount(jumlahPermata) * permata
//        }
//    }
//}
//
//fun getSellableItemCount(jumlah: Int): Int {
//    return jumlah / 2
//}