package resourceToObject

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import resourceToObject.data.ResourceExtension
import resourceToObject.factories.CreateFactory
import resourceToObject.factories.JsonReaderFactory
import resourceToObject.factories.YamlReaderFactory

internal class CreateFactoryTest : BaseTest() {

  @Test
  fun createInstanceJson() {
    val instanceFactory = CreateFactory.readExtension(ResourceExtension.JSON)
    assertTrue(instanceFactory is JsonReaderFactory, "Concrete factory isn't instance of JsonReaderFactory")
  }

  @Test
  fun createInstanceYaml() {
    val instanceFactory = CreateFactory.readExtension(ResourceExtension.YAML)
    assertTrue(instanceFactory is YamlReaderFactory,"Concrete factory isn't instance of YamlReaderFactory")
  }
}