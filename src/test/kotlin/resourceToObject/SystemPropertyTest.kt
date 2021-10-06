package resourceToObject

import config.ConfigurationHolder
import config.ResourceType
import config.provider.ConfigurationFactoryManager
import org.apache.logging.log4j.LogManager
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

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
    ConfigurationFactoryManager.setConfigurationFactory(jsonSystemVar).readConfiguration()
    val jsonConfigurationInstance = ConfigurationHolder.getConfiguration()
    logger.info(jsonConfigurationInstance)
  }
}