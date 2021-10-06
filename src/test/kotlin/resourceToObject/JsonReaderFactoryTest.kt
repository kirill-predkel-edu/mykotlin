package resourceToObject

import config.ConfigurationHolder
import config.ResourceType
import config.provider.ConfigurationFactoryManager
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

internal class JsonReaderFactoryTest : BaseTest() {

  @Test
  fun readConfiguration_JsonType_configurationIsCorrect() {
    ConfigurationFactoryManager.setConfigurationFactory(ResourceType.JSON).readConfiguration()
    val jsonConfigurationInstance = ConfigurationHolder.getConfiguration()
    assertAll("All fields should be equal to configuration file",
      { Assertions.assertEquals("jsonLogin", jsonConfigurationInstance.user.login) },
      { Assertions.assertEquals("jsonPassword", jsonConfigurationInstance.user.password) },
      { Assertions.assertEquals("jsonHost", jsonConfigurationInstance.crm.host) },
      { Assertions.assertEquals("jsonEndpoint", jsonConfigurationInstance.crm.endpoint) }
    )
  }
}