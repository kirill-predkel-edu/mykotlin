package resourceToObject


  fun main() {
    val test: ConfigurationInstances = YamlToObject.readYaml("src/main/resources/configurationresources/configuration" +
        ".yaml",ConfigurationInstances::class)
    println(test)
  }
