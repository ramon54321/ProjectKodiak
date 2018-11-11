package ramonbrand.sandbox.ecs.systems

import ramonbrand.kodiak.ecs.components.KComponentFactory
import ramonbrand.kodiak.ecs.entities.KEntity
import ramonbrand.kodiak.ecs.messages.KMessagePing
import ramonbrand.kodiak.ecs.systems.KSystem
import ramonbrand.sandbox.ecs.components.ComponentDebug
import ramonbrand.sandbox.ecs.components.ComponentType

class DebugSystem : KSystem() {
    override fun addEntity(kEntity: KEntity) {
        this.kEntityStore.insert(kEntity)
        KComponentFactory.create(kEntity, ::ComponentDebug)
    }

    override fun removeEntity(kEntity: KEntity) {
        this.kEntityStore.removeById(kEntity.id)
        kEntity.removeComponent(ComponentType.DEBUG)
    }

    override fun process() {
        this.kEntityStore.forEach { kEntity ->
            kEntity.getComponent(ComponentType.DEBUG).sendMessage(KMessagePing())
        }
    }
}