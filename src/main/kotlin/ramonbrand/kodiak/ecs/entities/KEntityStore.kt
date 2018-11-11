package ramonbrand.kodiak.ecs.entities

import ramonbrand.kodiak.ecs.stores.KIGetById
import ramonbrand.kodiak.ecs.stores.KIStore

class KEntityStore : KIStore<KEntity>, KIGetById<KEntity> {
    private val entitiesById = HashMap<Int, KEntity>()

    override fun insert(element: KEntity) {
        entitiesById[element.id] = element
    }

    override fun forEach(action: (element: KEntity) -> Unit) {
        this.entitiesById.forEach { _: Int, element: KEntity ->
            action(element)
        }
    }

    override fun getById(id: Int): KEntity {
        return entitiesById[id]
                ?: throw AssertionError("KEntity with given ID does not exist.")
    }

    override fun removeById(id: Int) {
        entitiesById.remove(id)
    }
}