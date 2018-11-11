package ramonbrand.sandbox

import ramonbrand.kodiak.ecs.entities.KEntity
import ramonbrand.sandbox.ecs.EntityComponentSystem

class Game {

    private var step = 0
    private val entityComponentSystem: EntityComponentSystem = EntityComponentSystem()

    fun init() {
        val e1: KEntity = entityComponentSystem.createEntity()
        entityComponentSystem.debugSystem.addEntity(e1)
    }

    fun step() {
        println("Game Step ${this.step}")

        entityComponentSystem.debugSystem.process()

        this.step++
    }
}
