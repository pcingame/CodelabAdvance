package com.pc.codelabadvance

data class PMFirst(
    var oMonth: String,
    var oPoint: String
)

data class PMLast(
    var lMonth: String,
    var lPoint: String,
    var lFirst: Boolean,
    var lLast: Boolean,
    var index: Int
)

fun main() {
    val pMFirstList = listOf(
        PMFirst("1", "5"),
        PMFirst("2", "7"),
        PMFirst("3", "2"),
        PMFirst("4", "10"),
        PMFirst("5", "11")
    )

    val pMLastList = pMFirstList.map { list ->
        PMLast(list.oMonth, list.oPoint, false, false, pMFirstList.indexOf(PMFirst(list.oMonth, list.oPoint)))
    }

    println(pMLastList)
}