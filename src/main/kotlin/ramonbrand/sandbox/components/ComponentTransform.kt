package ramonbrand.sandbox.components

import ramonbrand.kodiak.components.KComponent
import ramonbrand.kodiak.components.KComponentType
import ramonbrand.kodiak.entities.KEntity
import ramonbrand.kodiak.messages.KMessage
import ramonbrand.sandbox.messages.MessageMove

class ComponentTransform(id: Int, KEntity: KEntity) : KComponent(id, KEntity) {
    override val kComponentType: KComponentType
        get() = ComponentType.TRANSFORM

    var x: Float = 0f
    var y: Float = 0f

    override fun sendMessage(KMessage: KMessage) = when (KMessage) {
        is MessageMove -> {
            this.x += KMessage.x
            this.y += KMessage.y
        }
        else -> {}
    }
}