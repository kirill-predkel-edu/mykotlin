package resourceToObject

import org.apache.logging.log4j.LogManager
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import resourceToObject.data.ResourceExtension
import resourceToObject.factories.ExtensionReader

internal class SystemPropertyTest : BaseTest() {
  private val logger = LogManager.getLogger()

  @BeforeEach
  fun setUps() {
    System.setProperty("jsonExtension", "JSON")
  }

  @AfterEach
  fun tearDowns() {
    System.clearProperty("jsonExtension")
  }

  @Test
  fun readConfiguration_SystemVariable_ConfigurationIsRead() {
    val jsonSystemVar = ResourceExtension.valueOf(System.getProperty("jsonExtension"))
    val instanceFactory = ExtensionReader.readExtension(jsonSystemVar)
    val jsonConfigurationInstance = instanceFactory.readConfiguration()
    logger.info(jsonConfigurationInstance)
  }
}