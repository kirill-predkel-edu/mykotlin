package resourceToObject

import org.apache.logging.log4j.LogManager
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import resourceToObject.data.ResourceExtension
import resourceToObject.factories.CreateFactory

internal class ParametrizedTest : BaseTestClass() {
  private val logger = LogManager.getLogger()

  @ParameterizedTest
  @EnumSource(ResourceExtension::class)
  fun createInstanceEnumSourcePrintInstance(resourceExtension: ResourceExtension) {
    val instanceFactory = CreateFactory.readExtension(resourceExtension)
    val configurationInstance = instanceFactory.readConfiguration()
    logger.info(configurationInstance)
  }
}