package ramonbrand.kodiak.ecs.components

import ramonbrand.kodiak.ecs.entities.KEntity
import ramonbrand.kodiak.ecs.messages.KMessage
import ramonbrand.kodiak.ecs.messages.KMessagePing
import ramonbrand.kodiak.logging.KLogger

class KComponentEcho(id: Int, KEntity: KEntity) : KComponent(id, KEntity) {
    override val kComponentType: KComponentType
        get() = KComponentType.ECHO

    override fun sendMessage(kMessage: KMessage) = when (kMessage) {
        is KMessagePing -> KLogger.trace("I am an ECHO KComponent, and I received a ping.")
        else -> {}
    }
}