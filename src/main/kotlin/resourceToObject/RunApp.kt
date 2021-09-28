package resourceToObject

import resourceToObject.data.ResourceExtension
import resourceToObject.factories.ConfigurationFactory
import resourceToObject.instances.InstanceFromResource

fun main() {
  val configurationObject = ConfigurationFactory
    .create<InstanceFromResource>(ResourceExtension.YAML)
    .createInstance()
    .readFromResource()
  println(configurationObject)
}