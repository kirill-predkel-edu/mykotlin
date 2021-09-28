package resourceToObject.instances

import resourceToObject.data.ConfigurationInstance
import resourceToObject.readers.JsonToObject

class InstanceFromJson : InstanceFromResource {
  private val jsonPath: String = "src/main/resources/configuration_resources/configuration.json"
  override fun readFromResource(): ConfigurationInstance {
    return JsonToObject.readJson(jsonPath)
  }
}