package resourceToObject.instances

import resourceToObject.data.ConfigurationInstance

interface InstanceFromResource {
  fun readFromResource(): ConfigurationInstance
}