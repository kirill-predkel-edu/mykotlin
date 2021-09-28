package resourceToObject

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

data class ConfigurationInstances(val user: UserConfiguration,val crm: CrmConfiguration)

data class CrmConfiguration(
  val host: String?,
  val endpoint: String?
)

data class UserConfiguration(
  val login: String?,
  val password: String?
)

fun main() {
  val mapper = jacksonObjectMapper()
  val jsonFile = mapper.readValue<ConfigurationInstances>(File
    ("src/main/resources/configurationresources/configuration.json"))
  println(jsonFile)
}