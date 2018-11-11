package ramonbrand.sandbox.components

import ramonbrand.kodiak.components.KComponentType

class ComponentType(override val type: String) : KComponentType(type) {
    companion object {
        val TRANSFORM: KComponentType = KComponentType("TRANSFORM")
    }
}