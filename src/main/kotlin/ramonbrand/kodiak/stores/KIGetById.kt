package ramonbrand.kodiak.stores

import ramonbrand.kodiak.identification.KIId

interface KIGetById<T> where T : KIId {
    fun getById(elementId: Int): T
    fun removeById(elementId: Int): Boolean
}