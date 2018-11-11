package ramonbrand.kodiak

import ramonbrand.kodiak.entities.KEntity
import ramonbrand.kodiak.entities.KEntityFactory
import ramonbrand.kodiak.entities.KEntityStore

abstract class KEntityComponentSystem {
    private val kEntityStore: KEntityStore = KEntityStore()

    fun createEntity(): KEntity {
        val kEntity: KEntity = KEntityFactory.create(::KEntity)
        kEntityStore.insert(kEntity)
        return kEntity
    }

    fun deleteEntity() {
        // TODO: Implement delete KEntity
    }

    fun getEntityById(id: Int): KEntity {
        return kEntityStore.getById(id)
    }
}