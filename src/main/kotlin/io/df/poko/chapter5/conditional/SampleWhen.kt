package io.df.henry.io.df.poko.`when`

class Sample {

}

fun main() {
    println("Is it going to rain?")
    val probability = 100
    when {
        probability < 40 -> "Na-ha"
        probability <= 80 -> "Likely"
        probability <= 100 -> "Yes"
        else -> "Holly Crab"
    }.print()

    val superuser = true
    val hasAccess: Boolean = if (superuser) {
        println("Good morning, sir Admin")
        true // 마지막 문장이 반환 됨.
    } else {
        false
    }

    println(hasAccess) // true

    describe(null) // Nothing
    describe(1) // Small number
    describe(3) // Small number
    describe(7) //magic number!
    describe(9) //  Big number
    describe("AAA") //  This is just AAA
    describe(1L) //  This is Long or Int
    describe(-1) //  This is Long or Int
    describe(1.0) //  No idea, really

    describeReturnStr(null).println()
    describeReturnStr(2).println()
    describeReturnStr(5).println()






}

fun String?.print() {
    print(this)
}

fun String?.println() {
    println(this)
}

private val magicNumbers = listOf(7, 13)
fun describe(a: Any?) {

    when (a) {
        null -> println("Nothing")
        1, 2, 3 -> println("Small number")
        in magicNumbers -> println("magic number!")
        in 4..100 -> println("Big number")
        is String -> println("This is just $a")
        is Long, is Int -> println("This is Long or Int") // 여러 조건일 경우 쉼표로
        else -> println("No idea, really")
    }
}

fun describeReturnStr(a: Any?) : String = when(a) {
    null -> "Nothing"
    1, 2, 3 -> "Small number"
    in magicNumbers -> "magic number!"
    in 4..100 -> "Big number"
    is String -> "This is just $a"
    is Long, is Int -> "This is Long or Int"
    else -> "No idea, really"
}