package resourceToObject.factories

import resourceToObject.data.ConfigurationInstance

interface ConfigurationFactory {
  fun createInstance(): ConfigurationInstance
}