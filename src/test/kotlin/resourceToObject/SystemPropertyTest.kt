package resourceToObject

import org.apache.logging.log4j.LogManager
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import config.ResourceType
import config.provider.ConfigurationFactoryManager

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
    val jsonSystemVar = ResourceType.valueOf(System.getProperty("jsonExtension"))
    val instanceFactory = ConfigurationFactoryManager.setConfigurationFactory(jsonSystemVar)
    val jsonConfigurationInstance = instanceFactory.readConfiguration()
    logger.info(jsonConfigurationInstance)
  }
}