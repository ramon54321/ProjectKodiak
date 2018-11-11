package ramonbrand.sandbox

enum class ApplicationState {
    RUNNING, STOPPED
}

fun main(args: Array<String>) {
    // Time in milliseconds for each step
    val stepTime = 1000L

    val applicationState = ApplicationState.RUNNING
    val game = Game()

    game.init()

    // Step game infinitely while application is running
    // TODO: Implement better game loop
    while (applicationState == ApplicationState.RUNNING) {
        game.step()
        Thread.sleep(stepTime)
    }
}
