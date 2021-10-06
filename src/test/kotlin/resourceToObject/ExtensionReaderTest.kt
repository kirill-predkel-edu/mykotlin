package resourceToObject

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import resourceToObject.data.ResourceExtension
import resourceToObject.factories.ExtensionReader
import resourceToObject.factories.JsonReaderFactory
import resourceToObject.factories.YamlReaderFactory

internal class ExtensionReaderTest : BaseTest() {

  @Test
  fun readExtension_JsonExtension_FactoryIsCreated() {
    val instanceFactory = ExtensionReader.readExtension(ResourceExtension.JSON)
    assertTrue(instanceFactory is JsonReaderFactory, "Concrete factory isn't instance of JsonReaderFactory")
  }

  @Test
  fun readExtension_YamlExtension_FactoryIsCreated() {
    val instanceFactory = ExtensionReader.readExtension(ResourceExtension.YAML)
    assertTrue(instanceFactory is YamlReaderFactory,"Concrete factory isn't instance of YamlReaderFactory")
  }
}