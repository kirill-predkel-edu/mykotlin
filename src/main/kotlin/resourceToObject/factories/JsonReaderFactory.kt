package resourceToObject.factories

import resourceToObject.instances.InstanceFromJson
import resourceToObject.instances.InstanceFromResource

class JsonReaderFactory : ConfigurationFactory() {
  override fun createInstance(): InstanceFromResource {
    return InstanceFromJson()
  }
}