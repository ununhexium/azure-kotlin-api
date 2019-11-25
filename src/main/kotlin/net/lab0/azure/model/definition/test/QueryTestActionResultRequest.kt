package net.lab0.azure.model.definition.test

import kotlin.String

interface QueryTestActionResultRequest {
  val identifier: LegacyTestCaseResultIdentifier

  val projectName: String
}
