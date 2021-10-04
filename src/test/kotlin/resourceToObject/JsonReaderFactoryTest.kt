package resourceToObject

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import resourceToObject.data.ResourceExtension
import resourceToObject.factories.CreateFactory

internal class JsonReaderFactoryTest : BaseTest() {

  @Test
  fun readConfiguration_JsonExtension_configurationIsCorrect() {
    val instanceFactory = CreateFactory.readExtension(ResourceExtension.JSON)
    val jsonConfigurationInstance = instanceFactory.readConfiguration()
    assertAll("All fields should be equal to configuration file",
      { Assertions.assertEquals("jsonLogin", jsonConfigurationInstance.user.login) },
      { Assertions.assertEquals("jsonPassword", jsonConfigurationInstance.user.password) },
      { Assertions.assertEquals("jsonHost", jsonConfigurationInstance.crm.host) },
      { Assertions.assertEquals("jsonEndpoint", jsonConfigurationInstance.crm.endpoint) }
    )
  }
}