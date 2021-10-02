package resourceToObject

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import resourceToObject.data.ResourceExtension
import resourceToObject.factories.CreateFactory

class InstanceMakerTest {
  @Test
  fun createInstanceJsonConfigurationVerifyFields() {
    val instance = CreateFactory.readExtension(ResourceExtension.JSON).readConfiguration()
    val anotherInstance = CreateFactory.readExtension(ResourceExtension.YAML).readConfiguration()
    assertTrue(instance === anotherInstance, "Fabrics should has referential equality ")
  }
}