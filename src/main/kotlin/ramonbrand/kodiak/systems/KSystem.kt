package ramonbrand.kodiak.systems

import ramonbrand.kodiak.entities.KEntity
import ramonbrand.kodiak.entities.KEntityStore

abstract class KSystem {
    protected val kEntityStore: KEntityStore = KEntityStore()

    abstract fun addEntity(kEntity: KEntity): Boolean
    abstract fun removeEntity(kEntity: KEntity): Boolean
    abstract fun processEntities(): Boolean
}
