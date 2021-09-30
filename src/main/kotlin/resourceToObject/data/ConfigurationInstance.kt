package resourceToObject.data

data class ConfigurationInstance(
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