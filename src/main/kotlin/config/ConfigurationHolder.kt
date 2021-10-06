package config

import config.model.Configuration

object ConfigurationHolder {
   private lateinit var instance: Configuration
//добавить геттер, поправить сеттер
   //перепелить инстанс мейкер тест
  fun getConfiguration(configuration: Configuration): Configuration {
    if (!this::instance.isInitialized) {
      instance = configuration
    }
    return instance
  }
}