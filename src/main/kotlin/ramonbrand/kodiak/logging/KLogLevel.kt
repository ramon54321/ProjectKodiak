package ramonbrand.kodiak.logging

enum class KLogLevel(val level: Int) {
    DEBUG(0), TRACE(1), INFO(2),
    WARN(3), ERROR(4), FATAL(5)
}