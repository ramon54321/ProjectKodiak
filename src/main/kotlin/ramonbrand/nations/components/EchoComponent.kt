package ramonbrand.nations.components

import ramonbrand.nations.messages.Message
import ramonbrand.nations.messages.MessagePing
import ramonbrand.nations.messages.MessageString

class EchoComponent : IComponent {
    override val componentType: ComponentType
        get() = ComponentType.Echo

    override fun sendMessage(message: Message) = when(message) {
        is MessagePing -> println("I am an Echo Component, and I received a ping.")
        is MessageString -> println("""I am an Echo Component, and I received ${message.string}""")
    }
}