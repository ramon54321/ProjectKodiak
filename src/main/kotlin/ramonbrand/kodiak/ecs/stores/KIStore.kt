package ramonbrand.kodiak.ecs.stores

import ramonbrand.kodiak.ecs.identification.KIId

interface KIStore<T> : KIGetById<T> where T : KIId {
    fun insert(element: T)
    fun forEach(action: (element: T) -> Unit)
}