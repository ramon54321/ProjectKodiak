package ramonbrand.nations.stores

import ramonbrand.nations.identification.IId

interface IStore<T> : IGetById<T> where T: IId {
    fun insert(element: T): Boolean
}