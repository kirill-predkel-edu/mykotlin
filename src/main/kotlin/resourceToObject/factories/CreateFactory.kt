package resourceToObject.factories

import resourceToObject.data.ResourceExtension

object CreateFactory {

  fun createFactory(resourceExtension: ResourceExtension): ConfigurationFactory =
    when (resourceExtension) {
      ResourceExtension.JSON -> JsonReaderFactory()
      ResourceExtension.YAML -> YamlReaderFactory()
    }
}