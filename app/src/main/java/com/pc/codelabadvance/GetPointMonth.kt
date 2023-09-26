package com.pc.codelabadvance

data class OriginData(
    var oMonth: String? = null,
    var oPoint: String? = null,
    var oHistoryDiv: String? = null
)

data class PointMonth(
    var currentIndex: String? = null,
    var listPM: List<ListDataPM>? = null
)

data class ListDataPM(
    var month: String? = null,
    var point: Int? = 0
)

fun main() {
    val listDataOrigin = listOf(
        OriginData("12", "10", "P2"),
        OriginData("11", "10", "P2"),
        OriginData("11", "6", "P3"),
        OriginData("3", "10", "P2"),
        OriginData("5", "10", "P2"),
        OriginData("5", "-4", "P2"),
        OriginData("3", "10", "P3"),
        OriginData("7", "6", "P2"),
        OriginData("9", "4", "P2"),
        OriginData("4", "5", "P2")
    )

    val listDataPM = listDataOrigin.filter { originData ->
        originData.oHistoryDiv == "P2"
    }.map { it ->
        ListDataPM(it.oMonth, it.oPoint?.toInt())
    }

    //1
    val monthTotalList = mutableListOf<ListDataPM>()
    val monthTotalMap = mutableMapOf<String, Int>()
    for (item in listDataPM) {
        val month = item.month ?: ""
        val point = item.point ?: 0
        val currentTotal = monthTotalMap.getOrElse(month) {0}
        monthTotalMap[month] = currentTotal + point
    }

    for ((month, totalPoints) in monthTotalMap) {
        monthTotalList.add(ListDataPM(month, totalPoints))
    }
    //2
    val listTotal2 = listDataPM.groupBy { it.month }.map { map ->
        ListDataPM(map.key, map.value.sumOf { it.point ?: 0 })
    }

    println(listDataPM)
    println(listDataPM.size)
    println(monthTotalList)
    println(listTotal2)

    // val listDataOriginA = listOf(
    //     ListDataPM("T12", 10),
    //     ListDataPM("T11", 10),
    //     ListDataPM("T11", 6),
    //     ListDataPM("T3", 10),
    //     ListDataPM("T5", 10),
    //     ListDataPM("T5", -4),
    //     ListDataPM("T3", 10),
    //     ListDataPM("T7", 6),
    //     ListDataPM("T9", 4),
    //     ListDataPM("T4", 5)
    // )
}