package resourceToObject

import resourceToObject.data.ResourceExtension
import resourceToObject.factories.CreateFactory

fun main() {
  val instanceFactory = CreateFactory.createFactory(ResourceExtension.JSON)

  val instance1 = instanceFactory.createInstance()
  val instance2 = instanceFactory.createInstance()

  println(instance1)
  println(instance2)
}