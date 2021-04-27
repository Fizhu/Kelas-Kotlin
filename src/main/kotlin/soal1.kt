val strings = "DJFKSKFMFIAAMKDPMKNFDKASMKIMKLPNKSMLAPA"
var wordFoundCount = 0

fun main() {
    repeat(strings.length*strings.length) {
        shuffle(strings)
        wordFoundCount += 1
    }
    print(wordFoundCount)
}

fun factorial(number: Int): Long {
    return when {
        //factorial can only apply for positive number
        number < 0 -> -1
        number in 0..1 -> 1
        else -> {
            var result = 1L
            for (i in 2..number) {
                result *= i
            }
            result
        }
    }
}

fun permutation(n: Int, r: Int) = factorial(n) / factorial(n - r)

fun shuffle(input: String): String {
    val characters: MutableList<Char> = ArrayList()
    for (c in input.toCharArray()) {
        characters.add(c)
    }
    val output = StringBuilder(input.length)
    while (characters.size != 0) {
        val randPicker = (Math.random() * characters.size).toInt()
        output.append(characters.removeAt(randPicker))
    }
    return output.toString()
}