package resourceToObject.factories

import resourceToObject.data.ResourceExtension
import resourceToObject.instances.InstanceFromResource

abstract class ConfigurationFactory {

  abstract fun createInstance(): InstanceFromResource

  companion object {
    inline fun <reified T : InstanceFromResource> create(resourceExtension: ResourceExtension): ConfigurationFactory =
      when (resourceExtension) {
        ResourceExtension.JSON -> JsonReaderFactory()
        ResourceExtension.YAML -> YamlReaderFactory()
      }
  }
}