package ramonbrand.kodiak.components

open class KComponentType(open val type: String) {

    companion object {
        val ECHO: KComponentType = KComponentType("ECHO")
    }

    override fun equals(other: Any?): Boolean {
        if(other == null || other !is KComponentType)
            return false
        return this.type == other.type
    }

    // TODO: Implement hashCode()
}