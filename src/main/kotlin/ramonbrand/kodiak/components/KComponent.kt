package ramonbrand.kodiak.components

import ramonbrand.kodiak.entities.KEntity
import ramonbrand.kodiak.identification.KIId
import ramonbrand.kodiak.messages.KMessage

abstract class KComponent(override val id: Int, val KEntity: KEntity) : KIId {
    abstract val kComponentType: KComponentType
    abstract fun sendMessage(KMessage: KMessage)
}
