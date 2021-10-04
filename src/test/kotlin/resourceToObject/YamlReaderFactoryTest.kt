package resourceToObject

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import resourceToObject.data.ResourceExtension
import resourceToObject.factories.CreateFactory

internal class YamlReaderFactoryTest : BaseTest() {

  @Test
  fun createInstanceYamlConfigurationVerifyFields() {
    val instanceFactory = CreateFactory.readExtension(ResourceExtension.YAML)
    val yamlConfigurationInstance = instanceFactory.readConfiguration()
    assertAll("All fields should be equal to configuration file",
      { Assertions.assertEquals("yamlLogin", yamlConfigurationInstance.user.login) },
      { Assertions.assertEquals("yamlPassword", yamlConfigurationInstance.user.password) },
      { Assertions.assertEquals("yamlHost", yamlConfigurationInstance.crm.host) },
      { Assertions.assertEquals("yamlEndpoint", yamlConfigurationInstance.crm.endpoint) }
    )
  }
}