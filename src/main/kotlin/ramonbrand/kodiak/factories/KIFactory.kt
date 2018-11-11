package ramonbrand.kodiak.factories

import ramonbrand.kodiak.identification.KIId

interface KIFactory<T> where T : KIId {
    fun create(constructor: (id: Int) -> T): T
}