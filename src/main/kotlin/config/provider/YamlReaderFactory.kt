package config.provider

import config.ConfigurationHolder
import config.provider.ConfigurationFactory.Companion.CONFIG_RESOURCES_PATH
import convert.YamlToObject

class YamlReaderFactory : ConfigurationFactory {
  private val yamlPath: String = "configuration.yaml"

  override fun readConfiguration() {
    ConfigurationHolder.setConfiguration(
      YamlToObject.readYaml
        ("$CONFIG_RESOURCES_PATH$yamlPath")
    )
  }
}