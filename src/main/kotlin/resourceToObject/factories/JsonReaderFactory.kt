package resourceToObject.factories

import resourceToObject.data.ConfigurationInstance
import resourceToObject.readers.JsonToObject

class JsonReaderFactory : ConfigFactory {
  private val jsonPath: String = "src/main/resources/configuration_resources/configuration.json"
  override fun createInstance(): ConfigurationInstance {
    return JsonToObject.readJson(jsonPath)
  }
}