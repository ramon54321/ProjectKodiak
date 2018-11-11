package ramonbrand.kodiak.entities

import ramonbrand.kodiak.factories.KIFactory

object KEntityFactory : KIFactory<KEntity> {
    private var nextId: Int = 0
    override fun create(constructor: (id: Int) -> KEntity): KEntity {
        val entity = constructor(this.nextId)
        this.nextId++
        return entity
    }
}