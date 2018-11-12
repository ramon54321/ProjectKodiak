package ramonbrand.kodiak.logging

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object KLogger {

    private val dateTimeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")
    private var kLogLevel: KLogLevel = KLogLevel.DEBUG

    fun setLogLevel(kLogLevel: KLogLevel) {
        this.kLogLevel = kLogLevel
    }

    fun debug(string: String) {
        log(KASCIColors.CYAN, string)
    }

    fun trace(string: String) {
        if (kLogLevel.level > KLogLevel.TRACE.level) return
        log(KASCIColors.WHITE, string)
    }

    fun info(string: String) {
        if (kLogLevel.level > KLogLevel.INFO.level) return
        log(KASCIColors.GREEN, string)
    }

    fun warn(string: String) {
        if (kLogLevel.level > KLogLevel.WARN.level) return
        log(KASCIColors.YELLOW, string)
    }

    fun error(string: String) {
        if (kLogLevel.level > KLogLevel.ERROR.level) return
        log(KASCIColors.RED, string)
    }

    fun fatal(string: String) {
        if (kLogLevel.level > KLogLevel.FATAL.level) return
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
