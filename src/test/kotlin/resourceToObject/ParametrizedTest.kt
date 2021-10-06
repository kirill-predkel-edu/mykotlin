package resourceToObject

import org.apache.logging.log4j.LogManager
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import org.junit.jupiter.params.provider.ValueSource
import config.ResourceType
import config.provider.ConfigurationFactoryManager

internal class ParametrizedTest : BaseTest() {
  private val logger = LogManager.getLogger()

  @ParameterizedTest
  @EnumSource(ResourceType::class)
  fun readConfiguration_EnumSource_ConfigurationIsRead(resourceType: ResourceType) {
    val instanceFactory = ConfigurationFactoryManager.setConfigurationFactory(resourceType)
    val configurationInstance = instanceFactory.readConfiguration()
    logger.info(configurationInstance)
  }

  @ParameterizedTest
  @ValueSource(strings = ["JSON", "YAML"])
  fun readConfiguration_ValueSource_ConfigurationIsRead(input: String) {
    val instanceFactory = ConfigurationFactoryManager.setConfigurationFactory(ResourceType.valueOf(input))
    val configurationInstance = instanceFactory.readConfiguration()
    logger.info(configurationInstance)
  }
}