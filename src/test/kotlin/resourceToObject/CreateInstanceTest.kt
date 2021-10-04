package resourceToObject

import org.apache.logging.log4j.LogManager
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import resourceToObject.data.ResourceExtension
import resourceToObject.factories.CreateFactory

internal class CreateInstanceTest : BaseTest() {
  private val logger = LogManager.getLogger()

  @Test
  fun createInstanceJsonConfigurationPrintInstance() {
    val instanceFactory = CreateFactory.readExtension(ResourceExtension.JSON)
    val jsonConfigurationInstance = instanceFactory.readConfiguration()
    logger.info(jsonConfigurationInstance)
  }

  @Test
  fun createInstanceYamlConfigurationPrintInstance() {
    val instanceFactory = CreateFactory.readExtension(ResourceExtension.YAML)
    val yamlConfigurationInstance = instanceFactory.readConfiguration()
    logger.info(yamlConfigurationInstance)
  }

  @ParameterizedTest
  @EnumSource(ResourceExtension::class)
  fun createInstanceEnumSourcePrintInstance(resourceExtension: ResourceExtension) {
    val instanceFactory = CreateFactory.readExtension(resourceExtension)
    val configurationInstance = instanceFactory.readConfiguration()
    logger.info(configurationInstance)
  }

  @Test
  fun createInstanceJsonConfigurationVerifyFields() {
    val instanceFactory = CreateFactory.readExtension(ResourceExtension.JSON)
    val jsonConfigurationInstance = instanceFactory.readConfiguration()
    assertAll("All fields should be equal to configuration file",
      { assertEquals("jsonLogin", jsonConfigurationInstance.user.login) },
      { assertEquals("jsonPassword", jsonConfigurationInstance.user.password) },
      { assertEquals("jsonHost", jsonConfigurationInstance.crm.host) },
      { assertEquals("jsonEndpoint", jsonConfigurationInstance.crm.endpoint) }
    )
  }

  @Test
  fun createInstanceYamlConfigurationVerifyFields() {
    val instanceFactory = CreateFactory.readExtension(ResourceExtension.YAML)
    val yamlConfigurationInstance = instanceFactory.readConfiguration()
    assertAll("All fields should be equal to configuration file",
      { assertEquals("yamlLogin", yamlConfigurationInstance.user.login) },
      { assertEquals("yamlPassword", yamlConfigurationInstance.user.password) },
      { assertEquals("yamlHost", yamlConfigurationInstance.crm.host) },
      { assertEquals("yamlEndpoint", yamlConfigurationInstance.crm.endpoint) }
    )
  }
}