package net.lab0.azure.accounts.model.definition

import kotlin.String

interface AccountPreferencesInternal {
  val culture: String

  val language: String

  val timeZone: String
}
