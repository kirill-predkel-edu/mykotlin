package resourceToObject

import resourceToObject.data.ResourceExtension
import resourceToObject.factories.CreateFactory

fun main() {
  val instanceFactory = CreateFactory.readExtension(ResourceExtension.YAML)
  val instanceFactorys = CreateFactory.readExtension(ResourceExtension.YAML)
  val instance1 = instanceFactory.readConfiguration()
  val instance2 = instanceFactorys.readConfiguration()

  println(instance1)
  println(instance2)
}