package ramonbrand.sandbox

import ramonbrand.kodiak.entities.KEntity

class Game {

    private var step = 0

    private val entityComponentSystem: EntityComponentSystem = EntityComponentSystem()

    /**
     * Called when Game is constructed.
     */
    fun init() {

        val e1: KEntity = entityComponentSystem.createEntity()
        entityComponentSystem.transformSystem.addEntity(e1)

    }

    /**
     * Called at interval from main application loop.
     */
    fun step() {
        println("Game Step ${this.step}")

        entityComponentSystem.transformSystem.processEntities()

//        if (this.step == 6) {
//
//        }

        this.step++
    }
}
