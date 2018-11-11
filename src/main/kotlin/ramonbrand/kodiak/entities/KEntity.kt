package ramonbrand.kodiak.entities

import ramonbrand.kodiak.components.KComponent
import ramonbrand.kodiak.components.KComponentType
import ramonbrand.kodiak.identification.KIId

class KEntity(override val id: Int) : KIId {
    private val components: MutableMap<KComponentType, KComponent> = HashMap(4)

    fun addComponent(kComponent: KComponent): KComponent {
        this.components[kComponent.kComponentType] = kComponent
        return kComponent
    }

    fun removeComponent(kComponentType: KComponentType): Boolean {
        this.components.remove(kComponentType)
        return true
    }

    fun getComponent(kComponentType: KComponentType): KComponent {
        return this.components[kComponentType]
                ?: throw IllegalStateException("No component found with given component type.")
    }
}

