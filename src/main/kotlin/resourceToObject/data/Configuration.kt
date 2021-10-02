package resourceToObject.data

data class Configuration(
  val user: UserConfiguration,
  val crm: CrmConfiguration
)

data class CrmConfiguration(
  val host: String?,
  val endpoint: String?
)

data class UserConfiguration(
  val login: String?,
  val password: String?
)