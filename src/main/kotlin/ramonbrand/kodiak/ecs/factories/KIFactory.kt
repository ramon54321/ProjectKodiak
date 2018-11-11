package ramonbrand.kodiak.ecs.factories

import ramonbrand.kodiak.ecs.identification.KIId

interface KIFactory<T> where T : KIId {
    fun create(constructor: (id: Int) -> T): T
}