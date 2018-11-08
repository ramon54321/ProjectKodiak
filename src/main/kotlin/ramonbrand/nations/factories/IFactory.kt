package ramonbrand.nations.factories

import ramonbrand.nations.identification.IId

interface IFactory<T> where T:IId {
   fun create(constructor: (id: Int) -> T): T
}