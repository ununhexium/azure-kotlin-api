package net.lab0.azure.model.definition.test

import kotlin.collections.List

interface ResultsByQueryResponse {
  val excessIds: List<LegacyTestCaseResultIdentifier>

  val testResults: List<LegacyTestCaseResult>
}
