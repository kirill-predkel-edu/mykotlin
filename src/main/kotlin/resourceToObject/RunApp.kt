package resourceToObject

import resourceToObject.data.ResourceExtension
import resourceToObject.factories.ConfigurationFactory

fun main() {
  val configurationObject = ConfigurationFactory
    .createFactory(ResourceExtension.YAML)
    .createInstance()
  println(configurationObject)
}