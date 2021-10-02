package resourceToObject.factories

import resourceToObject.data.Configuration
import resourceToObject.readers.YamlToObject

class YamlReaderFactory : ConfigurationFactory {
  private val yamlPath: String = "src/main/resources/configuration_resources/configuration.yaml"

  override fun readConfiguration(): Configuration {
    return InstanceMaker.createInstance(YamlToObject.readYaml(yamlPath, Configuration::class.java))
  }
}