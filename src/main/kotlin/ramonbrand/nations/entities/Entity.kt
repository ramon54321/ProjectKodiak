package ramonbrand.nations.entities

import ramonbrand.nations.components.ComponentType
import ramonbrand.nations.components.IComponent

class Entity(val id: Int) {
    private val components: MutableMap<ComponentType, IComponent> = HashMap(4)

    fun addComponent(iComponent: IComponent): IComponent {
        this.components[iComponent.componentType] = iComponent
        return iComponent
    }

    fun getComponent(componentType: ComponentType): IComponent {
        return this.components[componentType] ?: throw IllegalStateException("No component found with given EComponent.")
    }
}

