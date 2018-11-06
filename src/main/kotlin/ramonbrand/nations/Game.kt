package ramonbrand.nations

import ramonbrand.nations.components.EchoComponent
import ramonbrand.nations.components.ComponentType
import ramonbrand.nations.entities.Entity
import ramonbrand.nations.entities.EntityStore
import ramonbrand.nations.messages.MessageString

class Game {

    private val entityStore: EntityStore = EntityStore()

    private var step = 0

    /**
     * Called when Game is constructed.
     */
    fun init() {
        entityStore.init()

        val e1 = Entity(45)
        e1.addComponent(EchoComponent())

        entityStore.insert(e1)
    }

    /**
     * Called at interval from main application loop.
     */
    fun step() {
        println("""Game Step ${this.step}""")

        if(this.step == 6) {
            entityStore.getById(45).getComponent(ComponentType.Echo).sendMessage(MessageString("Bravo Seven"))
        }

        this.step++
    }
}
