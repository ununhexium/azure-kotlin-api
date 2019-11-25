package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String
import kotlin.collections.List

interface TestRunAbortMessage {
  val action: String

  val cause: String

  val details: List<String>

  val loggedDate: String

  val source: String
}
