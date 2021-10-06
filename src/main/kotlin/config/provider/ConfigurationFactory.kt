package config.provider

import config.model.Configuration

interface ConfigurationFactory {
  companion object {
    const val CONFIG_RESOURCES_PATH: String = "src/main/resources/configuration_resources/"
  }

  fun readConfiguration(): Configuration
}