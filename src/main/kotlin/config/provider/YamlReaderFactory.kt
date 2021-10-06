package config.provider

import config.ConfigurationHolder
import config.model.Configuration
import config.provider.ConfigurationFactory.Companion.CONFIG_RESOURCES_PATH
import convert.YamlToObject

class YamlReaderFactory : ConfigurationFactory {
  private val yamlPath: String = "configuration.yaml"

  override fun readConfiguration(): Configuration {
    return ConfigurationHolder.getConfiguration(YamlToObject.readYaml
      ("src/main/resources/configuration_resources/configuration.yaml"))
  }
}