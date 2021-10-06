package resourceToObject

import config.ConfigurationHolder
import config.ResourceType
import config.provider.ConfigurationFactoryManager
import org.apache.logging.log4j.LogManager
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import org.junit.jupiter.params.provider.ValueSource

internal class ParametrizedTest : BaseTest() {
  private val logger = LogManager.getLogger()

  @ParameterizedTest
  @EnumSource(ResourceType::class)
  fun readConfiguration_EnumSource_ConfigurationIsRead(resourceType: ResourceType) {
    ConfigurationFactoryManager.setConfigurationFactory(resourceType).readConfiguration()
    val configurationInstance = ConfigurationHolder.getConfiguration()
    logger.info(configurationInstance)
  }

  @ParameterizedTest
  @ValueSource(strings = ["JSON", "YAML"])
  fun readConfiguration_ValueSource_ConfigurationIsRead(input: String) {
    ConfigurationFactoryManager.setConfigurationFactory(ResourceType.valueOf(input)).readConfiguration()
    val configurationInstance = ConfigurationHolder.getConfiguration()
    logger.info(configurationInstance)
  }
}