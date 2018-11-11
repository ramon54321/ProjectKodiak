package ramonbrand.sandbox

import ramonbrand.kodiak.KEntityComponentSystem
import ramonbrand.kodiak.systems.KSystem
import ramonbrand.sandbox.systems.TransformSystem

class EntityComponentSystem : KEntityComponentSystem() {
    val transformSystem: KSystem = TransformSystem()
}