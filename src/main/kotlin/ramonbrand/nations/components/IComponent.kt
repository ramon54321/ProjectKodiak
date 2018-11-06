package ramonbrand.nations.components

import ramonbrand.nations.messages.Message

interface IComponent {
    val componentType: ComponentType
    fun sendMessage(message: Message)
}