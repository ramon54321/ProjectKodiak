package ramonbrand.nations.entities

class EntityStore {
    private val entitiesById = HashMap<Int, Entity>()

    fun init(): Boolean {
        // TODO: Implement
        return true
    }

    fun insert(entity: Entity): Boolean {
        entitiesById[entity.id] = entity
        // TODO: Implement insert check and return correct boolean
        return true
    }

    fun removeById(id: Int): Boolean {
        entitiesById.remove(id)
        // TODO: Implement remove check and return correct boolean
        return true
    }

    fun getById(id: Int): Entity {
        return entitiesById[id] ?: throw IllegalStateException("Entity with given ID does not exist.")
    }
}