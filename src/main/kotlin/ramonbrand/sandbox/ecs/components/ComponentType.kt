package ramonbrand.sandbox.ecs.components

import ramonbrand.kodiak.ecs.components.KComponentType

class ComponentType(override val type: String) : KComponentType(type) {
    companion object {
        val TRANSFORM: KComponentType = KComponentType("TRANSFORM")
        val DEBUG: KComponentType = KComponentType("DEBUG")
    }
}