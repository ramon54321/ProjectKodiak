package ramonbrand.nations.entities

import ramonbrand.nations.stores.IGetById
import ramonbrand.nations.stores.IStore

class EntityStore : IStore<Entity>, IGetById<Entity> {
    private val entitiesById = HashMap<Int, Entity>()

    override fun insert(element: Entity): Boolean {
        entitiesById[element.id] = element
        // TODO: Implement insert check and return correct boolean
        return true
    }

    override fun getById(id: Int): Entity {
        return entitiesById[id]
                ?: throw IllegalStateException("Entity with given ID does not exist.")
    }

    override fun removeById(id: Int): Boolean {
        entitiesById.remove(id)
        // TODO: Implement remove check and return correct boolean
        return true
    }
}