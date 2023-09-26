package com.pc.codelabadvance


data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: DayPart,
    val durationInMinutes: Int
)

enum class DayPart {
    Morning, Afternoon, Evening
}

fun main() {
    val event = Event(
        "Study Kotlin",
        "Commit to studying Kotlin at least 15 minutes per day.",
        DayPart.Evening,
        15
    )
    //println(event)
    val event1 = Event("Wake up", "Time to get up", DayPart.Morning, 0)
    val event2 = Event("Eat breakfast", "", DayPart.Morning, 15)
    val event3 = Event("Learn about Kotlin", "", DayPart.Afternoon, 30)
    val event4 = Event("Practice Compose", "", DayPart.Afternoon, 60)
    val event5 = Event("Watch latest DevBytes video", "", DayPart.Afternoon, 10)
    val event6 = Event("Check out latest Android Jetpack library", "", DayPart.Evening, 45)
    val eventList = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    val shortEvent = eventList.filter {
        it.durationInMinutes < 60
    }.joinToString(", ") {
        "${it.title} is ${it.durationInMinutes}"
    }
    println(shortEvent)

    eventList.groupBy {
        it.dayPart
    }.forEach { (dayPart, events) ->
        println("$dayPart: ${events.size} events")
    }
    //println("Last event of the day: ${eventList.last().title}")
    //println("First: ${eventList[3].durationOfEvent()}")
}

fun Event.durationOfEvent(): String {
    return if (this.durationInMinutes < 60) "short" else "long"
}
