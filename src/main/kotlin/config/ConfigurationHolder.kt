package config

import config.model.Configuration

object ConfigurationHolder {
  private lateinit var instance: Configuration

  fun setConfiguration(configuration: Configuration) {
    if (!this::instance.isInitialized) {
      instance = configuration
    }
  }

  fun getConfiguration(): Configuration {
    return instance
  }
}