package ramonbrand.sandbox

import ramonbrand.kodiak.ecs.entities.KEntity
import ramonbrand.kodiak.logging.KLogger
import ramonbrand.sandbox.ecs.EntityComponentSystem
import ramonbrand.sandbox.ecs.components.ComponentType
import ramonbrand.sandbox.ecs.messages.MessageString

class Game {

    private var step = 0
    private val entityComponentSystem: EntityComponentSystem = EntityComponentSystem()

    private var e1: KEntity? = null

    fun init() {
        KLogger.info("Game Initialized")
        e1 = entityComponentSystem.createEntity()
        entityComponentSystem.debugSystem.addEntity(e1!!)
    }

    fun step() {
        KLogger.trace("Game Step ${this.step}")

        entityComponentSystem.debugSystem.process()

        // Some game logic
        if (this.step == 4) {
            e1?.getComponent(ComponentType.DEBUG)?.sendMessage(MessageString("Something exciting happened!"))
        }

        this.step++
    }
}
