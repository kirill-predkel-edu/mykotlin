package resourceToObject.instances

import resourceToObject.data.ConfigurationInstance
import resourceToObject.readers.YamlToObject

class InstanceFromYaml : InstanceFromResource {
  private val yamlPath: String = "src/main/resources/configuration_resources/configuration.yaml"
  override fun readFromResource(): ConfigurationInstance {
    return YamlToObject.readYaml(yamlPath, ConfigurationInstance::class.java)
  }
}