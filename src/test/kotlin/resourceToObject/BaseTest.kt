package resourceToObject

import org.apache.logging.log4j.LogManager
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

internal abstract class BaseTest {
  private val logger = LogManager.getLogger()

  @BeforeEach
  fun setUp() {
    logger.info("This is Before each message!")
  }

  @AfterEach
  fun tearDown() {
    logger.info("This is After each message!")
  }
}