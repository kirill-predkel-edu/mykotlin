package resourceToObject.readers

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.KotlinModule
import java.nio.file.FileSystems
import java.nio.file.Files

object YamlToObject {
  private val mapper = ObjectMapper(YAMLFactory()).registerModule(KotlinModule())
  fun <T : Any> readYaml(filePath: String, objectClass: Class<T>): T {
    return Files.newBufferedReader(FileSystems.getDefault().getPath(filePath)).use {
      mapper.readValue(
        it,
        objectClass
      )
    }
  }
}