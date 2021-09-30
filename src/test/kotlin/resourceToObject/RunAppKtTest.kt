package resourceToObject

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import resourceToObject.data.ResourceExtension
import resourceToObject.factories.CreateFactory

internal class CreateInstanceTest : BaseTestClass() {

  @Test
  fun createInstanceJsonConfigurationPrintInstance() {
    val instanceFactory = CreateFactory.createFactory(ResourceExtension.JSON)
    val jsonConfigurationInstance = instanceFactory.createInstance()
    println(jsonConfigurationInstance)
  }

  @Test
  fun createInstanceYamlConfigurationPrintInstance() {
    val instanceFactory = CreateFactory.createFactory(ResourceExtension.YAML)
    val yamlConfigurationInstance = instanceFactory.createInstance()
    println(yamlConfigurationInstance)
  }

  @ParameterizedTest
  @EnumSource(ResourceExtension::class)
  fun createInstanceEnumSourcePrintInstance(resourceExtension: ResourceExtension) {
    val instanceFactory = CreateFactory.createFactory(resourceExtension)
    val configurationInstance = instanceFactory.createInstance()
    println(configurationInstance)
  }

  @Test
  fun createInstanceJsonConfigurationVerifyFields() {
    val instanceFactory = CreateFactory.createFactory(ResourceExtension.JSON)
    val jsonConfigurationInstance = instanceFactory.createInstance()
    assertAll("All fields should be equal to configuration file",
      { assertEquals("jsonLogin", jsonConfigurationInstance.user.login) },
      { assertEquals("jsonPassword", jsonConfigurationInstance.user.password) },
      { assertEquals("jsonHost", jsonConfigurationInstance.crm.host) },
      { assertEquals("jsonEndpoint", jsonConfigurationInstance.crm.endpoint) }
    )
  }

  @Test
  fun createInstanceYamlConfigurationVerifyFields() {
    val instanceFactory = CreateFactory.createFactory(ResourceExtension.YAML)
    val yamlConfigurationInstance = instanceFactory.createInstance()
    assertAll("All fields should be equal to configuration file",
      { assertEquals("yamlLogin", yamlConfigurationInstance.user.login) },
      { assertEquals("yamlPassword", yamlConfigurationInstance.user.password) },
      { assertEquals("yamlHost", yamlConfigurationInstance.crm.host) },
      { assertEquals("yamlEndpoint", yamlConfigurationInstance.crm.endpoint) }
    )
  }
}