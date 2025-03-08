package io.df.henry.io.df.poko.chapter5.conditional

import io.df.henry.io.df.poko.`when`.print

class SampleIf {
}

fun main() {
    printNumberSign(-2)
    print(",")
    printNumberSign(0)
    print(",")
    printNumberSign(2)

    println()
    printNumberSign2(-2)
    print(",")
    printNumberSign2(0)
    print(",")
    printNumberSign2(2)
}

fun printNumberSign(num:Int) {
    if (num < 0) {
        "Negative"
    } else if(num > 0) {
        "positive"
    } else {
        "zero"
    }.print()
// 아래와 같이 동작된다. if else if 사용할때 주의가 필요 함. 로직은 정상 동작했으나
// 결국 확장 함수에서 print가 되지 않은 케이스.
//    if (num < 0) {
//        "Negative"
//    } else {
//        if(num > 0) {
//            "positive"
//        } else {
//            "zero"
//        }.print()
//    }
}

fun printNumberSign2(num:Int) {
    when {
        num < 0 -> "Negative"
        num > 0 -> "Positive"
        else -> "zero"
    }.print()
}