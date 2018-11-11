package ramonbrand.kodiak.ecs.systems

import ramonbrand.kodiak.ecs.entities.KEntity
import ramonbrand.kodiak.ecs.entities.KEntityStore

abstract class KSystem {
    protected val kEntityStore: KEntityStore = KEntityStore()

    abstract fun addEntity(kEntity: KEntity)
    abstract fun removeEntity(kEntity: KEntity)
    abstract fun process()
}
