package resourceToObject.factories

import resourceToObject.data.Configuration

object InstanceMaker {
   private lateinit var instance: Configuration

  fun createInstance(test: Configuration): Configuration {
    if (!this::instance.isInitialized) {
      instance=test
    }
    return instance
  }
}