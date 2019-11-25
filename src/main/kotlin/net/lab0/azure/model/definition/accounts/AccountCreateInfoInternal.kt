package net.lab0.azure.model.definition.accounts

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

interface AccountCreateInfoInternal {
  val accountName: String

  val creator: String

  val organization: String

  val preferences: AccountPreferencesInternal

  val properties: PropertiesCollection

  val serviceDefinitions: List<JsonObject>
}
