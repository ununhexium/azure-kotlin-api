package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Int
import kotlin.String

interface ErrorDetails {
  val lastErrorDate: String

  val messageText: String

  val occurrences: Int

  val request: String

  val scenarioName: String

  val stackTrace: String

  val testCaseName: String
}
