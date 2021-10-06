package config.provider

import config.ConfigurationHolder
import config.provider.ConfigurationFactory.Companion.CONFIG_RESOURCES_PATH
import convert.JsonToObject

internal class JsonReaderFactory : ConfigurationFactory {
  private val jsonPath: String = "configuration.json"

  override fun readConfiguration() {
    ConfigurationHolder.setConfiguration(JsonToObject.readJson("$CONFIG_RESOURCES_PATH$jsonPath"))
  }
}