package resourceToObject

import org.apache.logging.log4j.LogManager
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import resourceToObject.data.ResourceExtension
import resourceToObject.factories.CreateFactory

internal class SystemPropertyTest : BaseTestClass() {
  private val logger = LogManager.getLogger()

  @BeforeEach
  override fun setUp() {
    System.setProperty("jsonExtension", "JSON")
  }

  @Test
  fun createInstanceJsonConfigurationWithSystemProperty() {
    val jsonSystemVar = ResourceExtension.valueOf(System.getProperty("jsonExtension"))
    val instanceFactory = CreateFactory.readExtension(jsonSystemVar)
    val jsonConfigurationInstance = instanceFactory.readConfiguration()
    logger.info(jsonConfigurationInstance)
  }

  @AfterEach
  override fun tearDown() {
    System.clearProperty("jsonExtension")
  }
}