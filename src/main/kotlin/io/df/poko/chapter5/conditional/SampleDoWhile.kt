package io.df.henry.io.df.poko.chapter5.conditional

class SampleDoWhile {
}

fun main() {
    var i=1
    while(i<10) {
        print(i)
        print(",")
        i*=2
    }
    var j = 1
    do {
        print(j)
        j*=2
    } while(j<10)
}