package resourceToObject

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import config.ResourceType
import config.provider.ConfigurationFactoryManager
import config.provider.JsonReaderFactory
import config.provider.YamlReaderFactory

internal class ConfigurationFactoryManagerTest : BaseTest() {

  @Test
  fun readExtension_JsonExtension_FactoryIsCreated() {
    val instanceFactory = ConfigurationFactoryManager.setConfigurationFactory(ResourceType.JSON)
    assertTrue(instanceFactory is JsonReaderFactory, "Concrete factory isn't instance of JsonReaderFactory")
  }

  @Test
  fun readExtension_YamlExtension_FactoryIsCreated() {
    val instanceFactory = ConfigurationFactoryManager.setConfigurationFactory(ResourceType.YAML)
    assertTrue(instanceFactory is YamlReaderFactory,"Concrete factory isn't instance of YamlReaderFactory")
  }
}