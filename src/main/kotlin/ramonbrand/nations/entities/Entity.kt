package ramonbrand.nations.entities

import ramonbrand.nations.components.ComponentType
import ramonbrand.nations.components.Component
import ramonbrand.nations.identification.IId

class Entity(override val id: Int) : IId {
    private val components: MutableMap<ComponentType, Component> = HashMap(4)

    fun addComponent(component: Component): Component {
        this.components[component.componentType] = component
        return component
    }

    fun getComponent(componentType: ComponentType): Component {
        return this.components[componentType]
                ?: throw IllegalStateException("No component found with given EComponent.")
    }
}

