package ramonbrand.kodiak.stores

import ramonbrand.kodiak.identification.KIId

interface KIStore<T> : KIGetById<T> where T : KIId {
    fun insert(element: T): Boolean
    fun forEach(action: (element: T) -> Boolean): Boolean
}