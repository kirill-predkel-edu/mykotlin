package resourceToObject.factories

import resourceToObject.data.Configuration
import resourceToObject.readers.JsonToObject

internal class JsonReaderFactory : ConfigurationFactory {
  private val jsonPath: String = "src/main/resources/configuration_resources/configuration.json"

  override fun readConfiguration(): Configuration {
    return InstanceMaker.getInstance(JsonToObject.readJson(jsonPath))
  }
}