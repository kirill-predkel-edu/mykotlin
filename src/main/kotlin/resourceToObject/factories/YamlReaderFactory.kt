package resourceToObject.factories

import resourceToObject.data.ConfigurationInstance
import resourceToObject.readers.YamlToObject

class YamlReaderFactory : ConfigFactory {
  private val yamlPath: String = "src/main/resources/configuration_resources/configuration.yaml"
  override fun createInstance(): ConfigurationInstance {
    return YamlToObject.readYaml(yamlPath, ConfigurationInstance::class.java)
  }
}