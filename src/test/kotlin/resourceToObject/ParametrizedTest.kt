package resourceToObject

import org.apache.logging.log4j.LogManager
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import org.junit.jupiter.params.provider.ValueSource
import resourceToObject.data.ResourceExtension
import resourceToObject.factories.ExtensionReader

internal class ParametrizedTest : BaseTest() {
  private val logger = LogManager.getLogger()

  @ParameterizedTest
  @EnumSource(ResourceExtension::class)
  fun readConfiguration_EnumSource_ConfigurationIsRead(resourceExtension: ResourceExtension) {
    val instanceFactory = ExtensionReader.readExtension(resourceExtension)
    val configurationInstance = instanceFactory.readConfiguration()
    logger.info(configurationInstance)
  }

  @ParameterizedTest
  @ValueSource(strings = ["JSON", "YAML"])
  fun readConfiguration_ValueSource_ConfigurationIsRead(input: String) {
    val instanceFactory = ExtensionReader.readExtension(ResourceExtension.valueOf(input))
    val configurationInstance = instanceFactory.readConfiguration()
    logger.info(configurationInstance)
  }
}