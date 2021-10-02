package resourceToObject.factories

import resourceToObject.data.Configuration

interface ConfigurationFactory {
  fun readConfiguration(): Configuration
}