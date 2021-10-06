package resourceToObject

import config.ResourceType
import config.provider.ConfigurationFactoryManager
import config.provider.JsonReaderFactory
import config.provider.YamlReaderFactory
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class ConfigurationFactoryManagerTest : BaseTest() {

  @Test
  fun readExtension_JsonType_FactoryIsCreated() {
    val instanceFactory = ConfigurationFactoryManager.setConfigurationFactory(ResourceType.JSON)
    assertTrue(instanceFactory is JsonReaderFactory, "Concrete factory isn't instance of JsonReaderFactory")
  }

  @Test
  fun readExtension_YamlType_FactoryIsCreated() {
    val instanceFactory = ConfigurationFactoryManager.setConfigurationFactory(ResourceType.YAML)
    assertTrue(instanceFactory is YamlReaderFactory, "Concrete factory isn't instance of YamlReaderFactory")
  }
}