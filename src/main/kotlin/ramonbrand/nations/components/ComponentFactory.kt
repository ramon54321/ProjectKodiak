package ramonbrand.nations.components

import ramonbrand.nations.factories.IFactory

object ComponentFactory : IFactory<Component> {
    private var nextId: Int = 0
    override fun create(constructor: (id: Int) -> Component): Component {
        val component = constructor(this.nextId)
        this.nextId++
        return component
    }
}