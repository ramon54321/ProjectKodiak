package ramonbrand.sandbox.ecs

import ramonbrand.kodiak.ecs.KEntityComponentSystem
import ramonbrand.kodiak.ecs.systems.KSystem
import ramonbrand.sandbox.ecs.systems.DebugSystem

class EntityComponentSystem : KEntityComponentSystem() {
    val debugSystem: KSystem = DebugSystem()
}