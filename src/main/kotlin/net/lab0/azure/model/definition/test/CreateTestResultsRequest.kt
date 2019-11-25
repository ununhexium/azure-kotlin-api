package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List

interface CreateTestResultsRequest {
  val projectName: String

  val results: List<LegacyTestCaseResult>
}
