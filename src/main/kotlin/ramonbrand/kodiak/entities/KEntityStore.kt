package ramonbrand.kodiak.entities

import ramonbrand.kodiak.stores.KIGetById
import ramonbrand.kodiak.stores.KIStore

class KEntityStore : KIStore<KEntity>, KIGetById<KEntity> {
    private val entitiesById = HashMap<Int, KEntity>()

    override fun insert(element: KEntity): Boolean {
        entitiesById[element.id] = element
        // TODO: Implement insert check and return correct boolean
        return true
    }

    override fun forEach(action: (element: KEntity) -> Boolean): Boolean {
        this.entitiesById.forEach { _: Int, element: KEntity ->
            action(element)
        }
        return true
    }

    override fun getById(id: Int): KEntity {
        return entitiesById[id]
                ?: throw AssertionError("KEntity with given ID does not exist.")
    }

    override fun removeById(id: Int): Boolean {
        entitiesById.remove(id)
        // TODO: Implement remove check and return correct boolean
        return true
    }
}