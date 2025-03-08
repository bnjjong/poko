package io.df.henry.io.df.poko.`when`

class Sample {

}

fun main() {
    println("Is it going to rain?")
    val probability = 101
    val text = when {
        probability < 40 -> "Na-ha"
        probability <= 80 -> "Likely"
        probability <= 100 -> "Yes"
        else -> "Holly Crab"
    }.print()

}

fun String?.print() {
    print(this)
}