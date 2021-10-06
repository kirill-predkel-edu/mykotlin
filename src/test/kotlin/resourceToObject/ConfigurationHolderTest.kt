package resourceToObject

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import config.ResourceType
import config.provider.ConfigurationFactoryManager

internal class ConfigurationHolderTest : BaseTest() {

  @Test
  fun getConfiguration_readTwoConfigurations_ConfigurationsAreReferentiallyEqual() {
    val instance = ConfigurationFactoryManager.setConfigurationFactory(ResourceType.JSON).readConfiguration()
    val anotherInstance = ConfigurationFactoryManager.setConfigurationFactory(ResourceType.YAML).readConfiguration()
    assertTrue(instance === anotherInstance, "Configurations should has referential equality ")
  }
}