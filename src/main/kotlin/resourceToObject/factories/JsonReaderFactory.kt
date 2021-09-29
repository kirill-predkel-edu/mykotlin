package resourceToObject.factories

import resourceToObject.data.ConfigurationInstance
import resourceToObject.readers.JsonToObject

class JsonReaderFactory : ConfigFactory {

  private var uniqueConfigurationInstance: ConfigurationInstance? = null
  private val jsonPath: String = "src/main/resources/configuration_resources/configuration.json"

  override fun createInstance(): ConfigurationInstance {
    if (uniqueConfigurationInstance == null) {
      uniqueConfigurationInstance = JsonToObject.readJson(jsonPath)
    }
    return uniqueConfigurationInstance as ConfigurationInstance
  }
}