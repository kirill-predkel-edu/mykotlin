package resourceToObject

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import resourceToObject.data.ResourceExtension
import resourceToObject.factories.ExtensionReader

internal class InstanceMakerTest : BaseTest() {

  @Test
  fun getInstance_() {
    val instance = ExtensionReader.readExtension(ResourceExtension.JSON).readConfiguration()
    val anotherInstance = ExtensionReader.readExtension(ResourceExtension.YAML).readConfiguration()
    assertTrue(instance === anotherInstance, "Fabrics should has referential equality ")
  }
}