package ramonbrand.sandbox.systems

import ramonbrand.kodiak.components.KComponentEcho
import ramonbrand.kodiak.components.KComponentFactory
import ramonbrand.kodiak.components.KComponentType
import ramonbrand.sandbox.components.ComponentTransform
import ramonbrand.kodiak.entities.KEntity
import ramonbrand.kodiak.messages.KMessagePing
import ramonbrand.kodiak.systems.KSystem
import ramonbrand.sandbox.components.ComponentType

class TransformSystem : KSystem() {
    override fun addEntity(kEntity: KEntity): Boolean {
        this.kEntityStore.insert(kEntity)
        KComponentFactory.create(kEntity, ::ComponentTransform)
        KComponentFactory.create(kEntity, ::KComponentEcho)
        return true
    }

    override fun removeEntity(kEntity: KEntity): Boolean {
        this.kEntityStore.removeById(kEntity.id)
        kEntity.removeComponent(ComponentType.TRANSFORM)
        kEntity.removeComponent(KComponentType.ECHO)
        return true
    }

    override fun processEntities(): Boolean {
        this.kEntityStore.forEach { kEntity ->
            kEntity.getComponent(KComponentType.ECHO).sendMessage(KMessagePing())
            true
        }
        return true
    }
}