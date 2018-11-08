package ramonbrand.nations.entities

import ramonbrand.nations.factories.IFactory

object EntityFactory : IFactory<Entity> {
    private var nextId: Int = 0
    override fun create(constructor: (id: Int) -> Entity): Entity {
        val entity = constructor(this.nextId)
        this.nextId++
        return entity
    }
}