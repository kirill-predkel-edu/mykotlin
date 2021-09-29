package resourceToObject.factories

import resourceToObject.data.ConfigurationInstance
import resourceToObject.readers.YamlToObject

class YamlReaderFactory : ConfigFactory {

  private var uniqueConfigurationInstance: ConfigurationInstance? = null
  private val yamlPath: String = "src/main/resources/configuration_resources/configuration.yaml"

  override fun createInstance(): ConfigurationInstance {
    if (uniqueConfigurationInstance == null) {
      uniqueConfigurationInstance = YamlToObject.readYaml(yamlPath, ConfigurationInstance::class.java)
    }
    return uniqueConfigurationInstance as ConfigurationInstance
  }
}
