package ramonbrand.nations

enum class ApplicationState {
	RUNNING, STOPPED
}

fun main(args: Array<String>) {

	val applicationState = ApplicationState.RUNNING
	val game = Game()

	while(applicationState == ApplicationState.RUNNING) {
		println("Step")

		game.step()

		Thread.sleep(1000)
	}

    println("Hello world!")
}
