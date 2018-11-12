package ramonbrand.kodiak.logging

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object KLogger {

    private val dateTimeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")

    fun debug(string: String) {
        log(KASCIColors.CYAN, string)
    }

    fun trace(string: String) {
        log(KASCIColors.WHITE, string)
    }

    fun info(string: String) {
        log(KASCIColors.GREEN, string)
    }

    fun warn(string: String) {
        log(KASCIColors.YELLOW, string)
    }

    fun error(string: String) {
        log(KASCIColors.RED, string)
    }

    fun fatal(string: String) {
        log(KASCIColors.RED, string)
    }

    private fun log(color: String, string: String) {
        println("${color}${getTimestamp()} $string${KASCIColors.RESET}")
    }

    private fun getTimestamp(): String {
        val timeStamp = LocalDateTime.now().format(dateTimeFormatter)
        return "[$timeStamp]"
    }
}
