package resourceToObject

import config.ConfigurationHolder
import config.ResourceType
import config.provider.ConfigurationFactoryManager
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class ConfigurationHolderTest : BaseTest() {

  @Test
  fun getConfiguration_readTwoConfigurations_ConfigurationsAreReferentiallyEqual() {
    ConfigurationFactoryManager.setConfigurationFactory(ResourceType.JSON).readConfiguration()
    val configuration = ConfigurationHolder.getConfiguration()
    ConfigurationFactoryManager.setConfigurationFactory(ResourceType.YAML).readConfiguration()
    val anotherConfiguration = ConfigurationHolder.getConfiguration()
    assertTrue(configuration == anotherConfiguration, "Configurations should be equal ")
  }
}