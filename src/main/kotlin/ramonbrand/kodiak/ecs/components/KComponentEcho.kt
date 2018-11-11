package ramonbrand.kodiak.ecs.components

import ramonbrand.kodiak.ecs.entities.KEntity
import ramonbrand.kodiak.ecs.messages.KMessage
import ramonbrand.kodiak.ecs.messages.KMessagePing

class KComponentEcho(id: Int, KEntity: KEntity) : KComponent(id, KEntity) {
    override val kComponentType: KComponentType
        get() = KComponentType.ECHO

    override fun sendMessage(KMessage: KMessage) = when (KMessage) {
        is KMessagePing -> println("I am an ECHO KComponent, and I received a ping.")
        else -> {}
    }
}