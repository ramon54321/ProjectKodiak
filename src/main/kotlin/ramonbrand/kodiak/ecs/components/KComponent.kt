package ramonbrand.kodiak.ecs.components

import ramonbrand.kodiak.ecs.entities.KEntity
import ramonbrand.kodiak.ecs.identification.KIId
import ramonbrand.kodiak.ecs.messages.KMessage

abstract class KComponent(override val id: Int, val KEntity: KEntity) : KIId {
    abstract val kComponentType: KComponentType
    abstract fun sendMessage(KMessage: KMessage)
}
