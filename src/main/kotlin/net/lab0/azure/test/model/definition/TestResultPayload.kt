package net.lab0.azure.test.model.definition

import kotlin.String

interface TestResultPayload {
  val comment: String

  val name: String

  val stream: String
}
