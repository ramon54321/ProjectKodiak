package ramonbrand.nations.messages

sealed class Message

class MessagePing : Message()
class MessageString(val string: String) : Message()