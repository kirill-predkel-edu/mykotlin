package resourceToObject.factories

import resourceToObject.data.ResourceExtension

object ExtensionReader {

  fun readExtension(resourceExtension: ResourceExtension): ConfigurationFactory =
    when (resourceExtension) {
      ResourceExtension.JSON -> JsonReaderFactory()
      ResourceExtension.YAML -> YamlReaderFactory()
    }
}