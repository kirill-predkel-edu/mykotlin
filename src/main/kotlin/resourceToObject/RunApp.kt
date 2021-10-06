package resourceToObject

import resourceToObject.data.ResourceExtension
import resourceToObject.factories.ExtensionReader

fun main() {
  val instanceFactory = ExtensionReader.readExtension(ResourceExtension.YAML)

  val instanceFactorys = ExtensionReader.readExtension(ResourceExtension.JSON)
  val instance1 = instanceFactory.readConfiguration()
  val instance2 = instanceFactorys.readConfiguration()

  println(instance1)
  println(instance2)
}