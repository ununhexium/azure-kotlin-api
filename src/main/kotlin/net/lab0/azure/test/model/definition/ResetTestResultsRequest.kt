package net.lab0.azure.test.model.definition

import kotlin.String
import kotlin.collections.List

interface ResetTestResultsRequest {
  val ids: List<LegacyTestCaseResultIdentifier>

  val projectName: String
}
