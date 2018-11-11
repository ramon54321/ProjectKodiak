package ramonbrand.kodiak.ecs.entities

import ramonbrand.kodiak.ecs.factories.KIFactory

object KEntityFactory : KIFactory<KEntity> {
    private var nextId: Int = 0
    override fun create(constructor: (id: Int) -> KEntity): KEntity {
        val entity = constructor(nextId)
        nextId++
        return entity
    }
}