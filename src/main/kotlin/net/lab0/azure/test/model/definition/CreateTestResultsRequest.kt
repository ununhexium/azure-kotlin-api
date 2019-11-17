package net.lab0.azure.test.model.definition

import kotlin.String
import kotlin.collections.List

interface CreateTestResultsRequest {
  val projectName: String

  val results: List<LegacyTestCaseResult>
}
