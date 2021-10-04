package resourceToObject.factories

import resourceToObject.data.Configuration

object InstanceMaker {
   private lateinit var instance: Configuration

  fun getInstance(test: Configuration): Configuration {
    if (!this::instance.isInitialized) {
      instance=test
    }
    return instance
  }
}