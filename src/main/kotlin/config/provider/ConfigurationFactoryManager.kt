package config.provider

import config.ResourceType

object ConfigurationFactoryManager {

  fun setConfigurationFactory(resourceType: ResourceType): ConfigurationFactory {
    return when (resourceType) {
      ResourceType.JSON -> JsonReaderFactory()
      ResourceType.YAML -> YamlReaderFactory()
    }
  }
}