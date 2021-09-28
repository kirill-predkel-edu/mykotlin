package resourceToObject.factories

import resourceToObject.instances.InstanceFromResource
import resourceToObject.instances.InstanceFromYaml

class YamlReaderFactory : ConfigurationFactory() {
  override fun createInstance(): InstanceFromResource {
    return InstanceFromYaml()
  }
}