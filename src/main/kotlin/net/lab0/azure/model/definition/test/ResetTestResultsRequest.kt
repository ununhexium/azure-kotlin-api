package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List

interface ResetTestResultsRequest {
  val ids: List<LegacyTestCaseResultIdentifier>

  val projectName: String
}
