package ramonbrand.nations.components

import ramonbrand.nations.stores.IGetById
import ramonbrand.nations.stores.IStore

class ComponentStore : IStore<Component>, IGetById<Component> {
    private val componentsById = HashMap<Int, Component>()

    override fun insert(element: Component): Boolean {
        componentsById[element.id] = element
        return true
    }

    override fun getById(elementId: Int): Component {
        return componentsById[elementId]
                ?: throw IllegalStateException("Entity with given ID does not exist.")
    }

    override fun removeById(elementId: Int): Boolean {
        componentsById.remove(elementId)
        return true
    }
}