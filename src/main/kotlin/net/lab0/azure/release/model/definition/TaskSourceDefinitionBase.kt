package net.lab0.azure.release.model.definition

import kotlin.String

interface TaskSourceDefinitionBase {
  val authKey: String

  val endpoint: String

  val keySelector: String

  val selector: String

  val target: String
}
