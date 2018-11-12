package ramonbrand.sandbox.ecs.components

import ramonbrand.kodiak.ecs.components.KComponent
import ramonbrand.kodiak.ecs.components.KComponentType
import ramonbrand.kodiak.ecs.entities.KEntity
import ramonbrand.kodiak.ecs.messages.KMessage
import ramonbrand.sandbox.ecs.messages.MessageMove

class ComponentTransform(id: Int, KEntity: KEntity) : KComponent(id, KEntity) {
    override val kComponentType: KComponentType
        get() = ComponentType.TRANSFORM

    var x: Float = 0f
    var y: Float = 0f

    override fun sendMessage(kMessage: KMessage) = when (kMessage) {
        is MessageMove -> {
            this.x += kMessage.x
            this.y += kMessage.y
        }
        else -> {}
    }
}