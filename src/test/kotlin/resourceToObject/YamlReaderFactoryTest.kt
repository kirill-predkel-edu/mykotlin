package resourceToObject

import config.ConfigurationHolder
import config.ResourceType
import config.provider.ConfigurationFactoryManager
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

internal class YamlReaderFactoryTest : BaseTest() {

  @Test
  fun readConfiguration_YamlType_configurationIsCorrect() {
    ConfigurationFactoryManager.setConfigurationFactory(ResourceType.YAML).readConfiguration()
    val yamlConfigurationInstance = ConfigurationHolder.getConfiguration()
    assertAll("All fields should be equal to configuration file",
      { Assertions.assertEquals("yamlLogin", yamlConfigurationInstance.user.login) },
      { Assertions.assertEquals("yamlPassword", yamlConfigurationInstance.user.password) },
      { Assertions.assertEquals("yamlHost", yamlConfigurationInstance.crm.host) },
      { Assertions.assertEquals("yamlEndpoint", yamlConfigurationInstance.crm.endpoint) }
    )
  }
}