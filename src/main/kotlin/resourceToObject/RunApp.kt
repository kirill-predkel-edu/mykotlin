package resourceToObject

import resourceToObject.data.ResourceExtension
import resourceToObject.factories.ConfigurationFactory

fun main() {
  val instanceFactory = ConfigurationFactory
    .createFactory(ResourceExtension.JSON)

  val instance1 = instanceFactory.createInstance()
  val instance2 = instanceFactory.createInstance()

  println(instance1)
  println(instance2)
}