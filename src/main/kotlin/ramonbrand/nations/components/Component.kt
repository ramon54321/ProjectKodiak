package ramonbrand.nations.components

import ramonbrand.nations.factories.IFactory
import ramonbrand.nations.messages.Message
import ramonbrand.nations.identification.IId

abstract class Component(override val id: Int) : IId {
    abstract val componentType: ComponentType
    abstract fun sendMessage(message: Message)
}
