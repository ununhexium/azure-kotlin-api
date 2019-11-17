package net.lab0.azure.test.model.definition

import kotlin.collections.List

interface ResultsByQueryResponse {
  val excessIds: List<LegacyTestCaseResultIdentifier>

  val testResults: List<LegacyTestCaseResult>
}
