package net.lab0.azure.model.definition.accounts

import kotlin.String

interface AccountPreferencesInternal {
  val culture: String

  val language: String

  val timeZone: String
}
