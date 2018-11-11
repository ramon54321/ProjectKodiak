package ramonbrand.kodiak.components

import ramonbrand.kodiak.stores.KIGetById
import ramonbrand.kodiak.stores.KIStore

class KComponentStore : KIStore<KComponent>, KIGetById<KComponent> {
    private val componentsById = HashMap<Int, KComponent>()

    override fun insert(element: KComponent): Boolean {
        componentsById[element.id] = element
        return true
    }

    override fun forEach(action: (element: KComponent) -> Boolean): Boolean {
        this.componentsById.forEach { _: Int, element: KComponent ->
            action(element)
        }
        return true
    }

    override fun getById(elementId: Int): KComponent {
        return componentsById[elementId]
                ?: throw AssertionError("KEntity with given ID does not exist.")
    }

    override fun removeById(elementId: Int): Boolean {
        componentsById.remove(elementId)
        return true
    }
}