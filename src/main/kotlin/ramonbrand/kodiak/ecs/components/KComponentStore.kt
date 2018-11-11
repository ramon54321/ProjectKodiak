package ramonbrand.kodiak.ecs.components

import ramonbrand.kodiak.ecs.stores.KIGetById
import ramonbrand.kodiak.ecs.stores.KIStore

class KComponentStore : KIStore<KComponent>, KIGetById<KComponent> {
    private val componentsById = HashMap<Int, KComponent>()

    override fun insert(element: KComponent) {
        componentsById[element.id] = element
    }

    override fun forEach(action: (element: KComponent) -> Unit) {
        this.componentsById.forEach { _: Int, element: KComponent ->
            action(element)
        }
    }

    override fun getById(elementId: Int): KComponent {
        return componentsById[elementId]
                ?: throw AssertionError("KEntity with given ID does not exist.")
    }

    override fun removeById(elementId: Int) {
        componentsById.remove(elementId)
    }
}