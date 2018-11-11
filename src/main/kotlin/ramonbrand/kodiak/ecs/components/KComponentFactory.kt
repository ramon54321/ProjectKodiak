package ramonbrand.kodiak.ecs.components

import ramonbrand.kodiak.ecs.entities.KEntity

object KComponentFactory {
    private var nextId: Int = 0
    fun create(KEntity: KEntity, constructor: (id: Int, KEntity: KEntity) -> KComponent): KComponent {
        val component = constructor(nextId, KEntity)
        KEntity.addComponent(component)
        nextId++
        return component
    }
}