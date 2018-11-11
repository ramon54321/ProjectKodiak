package ramonbrand.sandbox.ecs.components

import ramonbrand.kodiak.ecs.components.KComponent
import ramonbrand.kodiak.ecs.components.KComponentType
import ramonbrand.kodiak.ecs.entities.KEntity
import ramonbrand.kodiak.ecs.messages.KMessage
import ramonbrand.sandbox.ecs.messages.MessageMove

class ComponentDebug(id: Int, KEntity: KEntity) : KComponent(id, KEntity) {
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