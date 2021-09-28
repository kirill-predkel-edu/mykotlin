package resourceToObject.readers

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

object JsonToObject {
  inline fun <reified T : Any> readJson(filePath: String): T {
    val mapper = jacksonObjectMapper()
    return mapper.readValue(File(filePath))
  }
}