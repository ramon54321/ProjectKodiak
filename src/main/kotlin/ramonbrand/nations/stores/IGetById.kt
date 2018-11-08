package ramonbrand.nations.stores

import ramonbrand.nations.identification.IId

interface IGetById<T> where T: IId {
    fun getById(elementId: Int): T
    fun removeById(elementId: Int): Boolean
}