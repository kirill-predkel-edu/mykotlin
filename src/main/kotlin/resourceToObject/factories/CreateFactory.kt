package resourceToObject.factories

import resourceToObject.data.ResourceExtension

object CreateFactory {

  fun readExtension(resourceExtension: ResourceExtension): ConfigurationFactory =
    when (resourceExtension) {
      ResourceExtension.JSON -> JsonReaderFactory()
      ResourceExtension.YAML -> YamlReaderFactory()
    }
}