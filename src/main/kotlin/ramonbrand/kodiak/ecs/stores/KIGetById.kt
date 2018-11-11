package ramonbrand.kodiak.ecs.stores

import ramonbrand.kodiak.ecs.identification.KIId

interface KIGetById<T> where T : KIId {
    fun getById(elementId: Int): T
    fun removeById(elementId: Int)
}