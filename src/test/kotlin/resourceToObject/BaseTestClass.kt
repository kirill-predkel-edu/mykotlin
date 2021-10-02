package resourceToObject

import org.apache.logging.log4j.LogManager
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import resourceToObject.data.ResourceExtension

internal abstract class BaseTestClass {
  private val logger = LogManager.getLogger()
  var jsonSystemVar = ResourceExtension.valueOf(System.getProperty("property1"))

  @BeforeEach
  open fun setUp() {
    logger.info("This is Before each message!")
  }

  @AfterEach
  open fun tearDown() {
    logger.info("This is After each message!")
  }
}