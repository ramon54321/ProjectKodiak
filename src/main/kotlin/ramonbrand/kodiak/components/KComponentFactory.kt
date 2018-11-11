package ramonbrand.kodiak.components

import ramonbrand.kodiak.entities.KEntity

object KComponentFactory {
    private var nextId: Int = 0
    fun create(KEntity: KEntity, constructor: (id: Int, KEntity: KEntity) -> KComponent): KComponent {
        val component = constructor(this.nextId, KEntity)
        KEntity.addComponent(component)
        this.nextId++
        return component
    }
}