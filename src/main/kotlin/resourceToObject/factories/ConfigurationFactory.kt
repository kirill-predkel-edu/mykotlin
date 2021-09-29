package resourceToObject.factories

import resourceToObject.data.ConfigurationInstance
import resourceToObject.data.ResourceExtension

object ConfigurationFactory {

  fun createFactory(resourceExtension: ResourceExtension): ConfigFactory =
    when (resourceExtension) {
      ResourceExtension.JSON -> JsonReaderFactory()
      ResourceExtension.YAML -> YamlReaderFactory()
    }
}

interface ConfigFactory {
  fun createInstance(): ConfigurationInstance
}