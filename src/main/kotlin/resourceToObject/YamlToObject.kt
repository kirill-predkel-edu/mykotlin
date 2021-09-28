package resourceToObject

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory

import java.nio.file.FileSystems
import java.nio.file.Files
import kotlin.reflect.KClass

object YamlToObject {
  private val mapper = ObjectMapper(YAMLFactory()).registerModule(KotlinModule())
  fun <T : Any> readYaml(filePath: String, instanceClass: KClass<T>): T {
    return Files.newBufferedReader(FileSystems.getDefault().getPath(filePath)).use { mapper.readValue(it,
      instanceClass.java) }
  }
}