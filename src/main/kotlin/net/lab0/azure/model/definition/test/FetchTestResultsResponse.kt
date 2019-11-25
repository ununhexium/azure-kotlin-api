package net.lab0.azure.model.definition.test

import kotlin.collections.List

interface FetchTestResultsResponse {
  val actionResults: List<TestActionResult>

  val attachments: List<TestResultAttachment>

  val deletedIds: List<LegacyTestCaseResultIdentifier>

  val results: List<LegacyTestCaseResult>

  val testParameters: List<TestResultParameter>
}
