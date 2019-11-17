package net.lab0.azure.test.model.definition

import kotlin.String

interface QueryTestActionResultRequest {
  val identifier: LegacyTestCaseResultIdentifier

  val projectName: String
}
